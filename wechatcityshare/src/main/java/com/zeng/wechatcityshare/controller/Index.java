package com.zeng.wechatcityshare.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.Logger; 

import com.zeng.wechatcityshare.model.UserInfo;
import com.zeng.wechatcityshare.service.UserService;


@Controller
@RequestMapping("/")
public class Index  {
	
	@Autowired  
    private UserService userService;  
	private static final Logger Log = Logger  
            .getLogger(Index.class);  
	
	@RequestMapping(value="/")
	public ModelAndView welcome() {
		Map<String, String> resMap = new HashMap<String, String>();
		resMap.put("message", "Hello World, 这是第一个java应用, this is my fist app");
		return new ModelAndView("welcome", resMap);
	}
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public  @ResponseBody UserInfo getUserInfo(@PathVariable String id) {
		int userId = Integer.parseUnsignedInt(id);
		Log.info("请求开始");
		UserInfo user = userService.getById(userId);
		Log.info("-------");
		Log.info(user.getId());
		//user.setUsername("zengfanwei");
		user.setPhone("120000");
		//user.setId(userId);
		user.setCreateTime("2017-02-03");
		user.setUpdateTime("2017-09-10");
		Log.info(user.getUsername());
		
		return user;
	}
	
}
