package com.wltbk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wltbk.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	/**
	 * 跳转到登录页面
	 * @return
	 */
	@RequestMapping("/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	/**
	 * 登录成功跳转
	 */
	@RequestMapping("/login")
	public String login(String name,String password,HttpServletRequest request) {
		String test = testService.getNameAndPassword(name, password);
		if(test.equals("success")) {
			request.setAttribute("message", "success");
			return "loginSuccess";
		}
		request.setAttribute("message", "fail");
		return "login";
	}
}
