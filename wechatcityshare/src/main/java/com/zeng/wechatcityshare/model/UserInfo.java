package com.zeng.wechatcityshare.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserInfo implements RowMapper<UserInfo>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String phone;
	private String sex;
	private String createTime;
	private String updateTime;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {  
		//System.out.print(rs);
		UserInfo userInfo = new UserInfo();  
        userInfo.setId(rs.getInt("id"));
        userInfo.setUsername(rs.getString("tch_name"));
        
        return userInfo;  
    }
 
	
}
