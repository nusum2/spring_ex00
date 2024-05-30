package com.docmall.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //클라이언트(브라우저)로부터 요청을 받아 실행하는 스프링 클래스는 컨트롤러 어노테이션을 클래스 수준으로 적용해야한다
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("/doD") //WEB-INF/views/ + "매핑주소" + .jsp
	//매핑주소를 jsp명으로 사용할 경우에는 메소드의 리턴타입이 void 이어야 한다
	//매핑주소를 jsp명으로 사용하지않을 경우에는 메소드의 리런타입을 String으로 해서
	public String doD() {
		
		logger.info("called doD...");
		return "testD"; //testD가 파일명이 된다.
	}
	@RequestMapping("/doE")
	public String doE() {
		logger.info("called doE...");
		return "testE";
	}
	@RequestMapping("/doF")
	public String doF() {
		logger.info("called doF...");
		return "testF";
	}
	
}
