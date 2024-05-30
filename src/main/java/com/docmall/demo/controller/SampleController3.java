package com.docmall.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //클라이언트(브라우저)로부터 요청을 받아 실행하는 스프링 클래스는 컨트롤러 어노테이션을 클래스 수준으로 적용해야한다
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	//?(물음표) 뒤에 문자열을 쿼리스트링(QueryString)
	// http://localhost:9090/doG?name=abc&age=100 출력 : name=abc age=100
    // http://localhost:9090/doG?age=100          출력 : name=null age=100 참조타입은 null로 처리되어 에러발생 안함.
	// http://localhost:9090/doG?name=abc         출력 : 에러발생 원인 : 파라미터가 기본데이터타입이면, 반드시 값을 제공해야한다.
	@RequestMapping("/doG")
	public String doG(String name, int age) {
		
		logger.info("이름은? : " + name);
		logger.info("나이는? : " + age);
		
		return "tesdG";
	}
	
}
