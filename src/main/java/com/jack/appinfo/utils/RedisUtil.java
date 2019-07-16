package com.jack.appinfo.utils;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class RedisUtil {
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	/**
	 * 判断key是否存在
	 * @param key redis键
	 * @return 存在true，不存在false
	 */
	public boolean hasKey(String key) {
		return redisTemplate.hasKey(key);
	}

	/**
	 * 根据多个key删除对应缓存
	 * @param key redis键
	 */
	public void deleteByKey(String...key) {
		if (key!=null && key.length > 0 ) {
			if (key.length == 1) {
				//删除一个
				redisTemplate.delete(key[0]);
			} else {
				redisTemplate.delete(CollectionUtils.arrayToList(key));
			}
		}
	}
	
	/**
	 * 普通缓存存入
	 * @param key 键
	 * @param value 值
	 * @return 成功true，失败false
	 */
	public boolean set(String key, Object value) {
		try {
			redisTemplate.opsForValue().set(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 普通缓存放入并设置过期时间
	 * @param key 键
	 * @param value 值
	 * @param time 时间(秒) time要大于0 如果time小于等于0 将设置无限期
	 * @return 成功true，失败false
	 */
	public boolean set(String key, Object value, long time) {
		try {
			if (time > 0) {
				redisTemplate.opsForValue().set(key, value,time, TimeUnit.SECONDS);
			} else {
				set(key, value);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Object getValueByKey(String key) {
		return redisTemplate.opsForValue().get(key);
	}
	
}
