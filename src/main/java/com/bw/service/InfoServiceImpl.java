package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Info;
import com.bw.bean.Teacher;
import com.bw.mapper.InfoMapper;

@Service
public class InfoServiceImpl implements InfoService{
	@Resource
	private InfoMapper infoMapper;

	@Override
	public List<Info> queryInfoAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return infoMapper.queryInfoAll(map);
	}

	@Override
	public List<Teacher> queryTeacher() {
		// TODO Auto-generated method stub
		return infoMapper.queryTeacher();
	}
	
	
	
}
