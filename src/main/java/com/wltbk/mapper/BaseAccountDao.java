package com.wltbk.mapper;

import org.apache.ibatis.annotations.Param;

import com.wltbk.bean.EtAdmin;

public interface BaseAccountDao {

	//定义一个通过账号和密码登录数据库的接口
		EtAdmin getMessageByNameAndPassword(@Param("name")String name,@Param("password")String password);
}
