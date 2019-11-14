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
	 * 璺宠浆鍒扮櫥褰曢〉闈�
	 * @return
	 */
	@RequestMapping("/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	/**
	 * 鐧诲綍鎴愬姛璺宠浆
	 */
	@RequestMapping("/login")
	public String login(String name,String password,HttpServletRequest request) {
		String test = testService.getNameAndPassword(name, password);
		if(test.equals("success")) {
			request.setAttribute("message", "success");
			System.out.println(test);
			return "loginSuccess";
		}
		request.setAttribute("message", "fail");
		return "login";
	}
}
