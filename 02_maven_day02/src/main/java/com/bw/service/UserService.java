package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.User;

public interface UserService {
	public List<User> queryAll(Map<String, Object> map);

}
