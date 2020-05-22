package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Info;
import com.bw.bean.Teacher;
import com.bw.service.InfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class InfoController {
	@Resource
	private InfoService infoService;
	
	@RequestMapping("queryAll")
	public String queryAll(Model model,@RequestParam(defaultValue = "1")Integer pageNum,
			String name,Integer tid,Integer status){
		PageHelper.startPage(pageNum, 2);
		
		Map<String, Object> map = new HashMap<>(); 
//		map.put("name", name);
//		map.put("tid", tid);
//		map.put("status", status);
		List<Info> list = infoService.queryInfoAll(map);
		PageInfo<Info> page = new PageInfo<>(list);
		model.addAttribute("page", page);
		//查询老师
		List<Teacher> queryTeacher = infoService.queryTeacher();
		model.addAttribute("queryTeacher", queryTeacher);

		return "list";
	}
	
	
	
}
