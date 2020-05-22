package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.User;
import com.bw.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> queryAll(Map<String, Object> map) {
		return userMapper.queryAll(map);
	}

}
