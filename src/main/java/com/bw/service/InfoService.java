package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Info;
import com.bw.bean.Teacher;

public interface InfoService {
	//晾被子信息
	public List<Info> queryInfoAll(Map<String, Object> map);
	
	public List<Teacher> queryTeacher();

}
