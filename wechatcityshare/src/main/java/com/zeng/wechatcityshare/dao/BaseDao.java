package com.zeng.wechatcityshare.dao;

import java.io.Serializable;
import java.util.List;

interface BaseDao<T, PK extends Serializable>  {
	T getById(PK id);  
	  
    List<T> findAll();  
  
    PK save(T entity);  
}
