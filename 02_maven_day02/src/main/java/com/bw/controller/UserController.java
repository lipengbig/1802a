package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.User;
import com.bw.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {
	@Resource
	private UserService userService; 
	@RequestMapping("queryAll")
	public String queryALl(Model model,@RequestParam(defaultValue = "1")Integer pageNum,String username){
		PageHelper.startPage(pageNum, 2);
		Map<String, Object> map = new HashMap<>();
		map.put("username", username);
		List<User> list = userService.queryAll(map);
		PageInfo<User> plist = new PageInfo<>(list);
		model.addAttribute("mape", map);
		model.addAttribute("plist", plist);
		return "list";
	}
}
