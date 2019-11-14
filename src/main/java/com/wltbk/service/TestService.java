package com.wltbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wltbk.bean.EtAdmin;
import com.wltbk.mapper.BaseAccountDao;

@Service
public class TestService {

	@Autowired
	private BaseAccountDao baseAccountDao;
	/**
	 * 一个银行登录的方法
	 */
	public String getNameAndPassword(String name,String password) {
		EtAdmin ed = baseAccountDao.getMessageByNameAndPassword(name, password);
		if(ed != null) {
			return "success";
		}
		return "fail";
	}
}
