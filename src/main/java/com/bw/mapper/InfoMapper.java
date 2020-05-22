package com.bw.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bw.bean.Info;
import com.bw.bean.Teacher;
@Component
public interface InfoMapper {
	//晾被子信息
	public List<Info> queryInfoAll(Map<String, Object> map);
	//宿管老师
	public List<Teacher> queryTeacher();
	
	
}
