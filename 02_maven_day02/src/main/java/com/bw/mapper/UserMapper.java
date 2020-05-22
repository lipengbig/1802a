package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.User;

public interface UserMapper {
	//条件查询
	public List<User> queryAll(Map<String, Object> map);
}
