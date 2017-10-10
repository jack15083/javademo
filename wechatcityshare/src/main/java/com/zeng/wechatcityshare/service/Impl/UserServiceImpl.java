package com.zeng.wechatcityshare.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeng.wechatcityshare.dao.UserDao;
import com.zeng.wechatcityshare.model.UserInfo;
import com.zeng.wechatcityshare.service.UserService;

@Service("userService") 
public class UserServiceImpl implements UserService {

    @Autowired  
    private UserDao userDao;  
  
    public UserInfo getById(Integer id) {  
        return userDao.getById(id);  
    }  

	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer save(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
