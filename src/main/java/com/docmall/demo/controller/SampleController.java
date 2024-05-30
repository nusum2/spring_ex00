package com.docmall.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //클라이언트(브라우저)로부터 요청을 받아 실행하는 스프링 클래스는 컨트롤러 어노테이션을 클래스 수준으로 적용해야한다
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/doA") //WEB-INF/views/ + "매핑주소" + .jsp
	public void doA() {
		logger.info("doA called...");
	}
	//매핑주소 /doB와 메소드명 doB() 이름은 상관x, 일치할 필요x
	@RequestMapping("/doB")
	public void doB() {
		//성능상의 이유로 사용하지 않는다
	//	System.out.println("doB called...");
		logger.info("doB called...");
	}
	@RequestMapping("/doC")
	public void doC() {
		logger.info("doC called...");
	}
}
