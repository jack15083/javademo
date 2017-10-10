package com.zeng.wechatcityshare.service;

import java.util.List;

import com.zeng.wechatcityshare.model.UserInfo;

public interface  UserService {
	 // 通过Id查询UserInfo  
    UserInfo getById(Integer id);  
  
    // 查询全部的UserInfo  
    List<UserInfo> findAll();  
  
    // 添加UserInfo  
    Integer save(UserInfo userInfo);  
}
