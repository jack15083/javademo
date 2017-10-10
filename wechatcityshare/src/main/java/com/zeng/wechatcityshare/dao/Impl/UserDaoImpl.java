package com.zeng.wechatcityshare.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zeng.wechatcityshare.dao.UserDao;
import com.zeng.wechatcityshare.model.UserInfo;

@Repository("userDao")  
public class UserDaoImpl implements UserDao {

	@Autowired  
    private JdbcTemplate jdbcTemplate;  
  
    //@Autowired  
    //private NamedParameterJdbcTemplate namedParameterJdbcTemplate;  
  
    public UserInfo getById(Integer id) {  
  
        String sql = "SELECT * FROM tch_teacher WHERE id = ?";  
  
        UserInfo userInfo = jdbcTemplate.queryForObject(sql, new UserInfo(),  
                new Object[] { id });  
  
        return userInfo;  
    }  

	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer save(UserInfo entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}