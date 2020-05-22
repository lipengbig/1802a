package com.lipeng.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.Info;
import com.bw.mapper.InfoMapper;

public class Test01 {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InfoMapper mapper = ac.getBean(InfoMapper.class);
		Map<String, Object> map = new HashMap<>(); 
		List<Info> list = mapper.queryInfoAll(map);
		for (Info info : list) {
			System.out.println(info);
		}
		
	
	}
}
