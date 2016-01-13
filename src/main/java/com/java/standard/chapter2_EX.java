package com.java.standard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ex2/*")
public class chapter2_EX {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * @return
	 * 		문자형 EX_2_1
	 * http://localhost:8080/standardofjava/java/standard/ex2/1
	 */
	@RequestMapping(value = "/1")
	// @ResponseBody
	public String chapter2_EX_2_1() {

		char ch = 'A';
		int code = (int) ch;

		log.debug("char : {}", ch); // A
		log.debug("int code : {}", code); // 65

		return "result";
	}

	/**
	 * @return
	 * 		문자형 EX_2_2
	 */
	@RequestMapping(value = "/2")
	// @ResponseBody
	public String chapter2_EX_2_2() {

		int code = 65;
		char ch = (char) code;

		log.debug("int code : {}", code); // 65
		log.debug("char : {}", ch); // A

		return null;
	}

	/**
	 * @return
	 * 		문자 결합
	 */
	@RequestMapping(value = "/3")
	// @ResponseBody
	public String chapter2_EX_2_3() {

		String s;
		
		s=1+" ";
		log.debug("문자 결합:{}.",s);
		
		s=" "+1;
		log.debug("문자 결합:{}.",s);
		
		s=1+"";
		log.debug("문자 결합:{}.",s);
		
		s=""+1;
		log.debug("문자 결합:{}.",s);
		
		s=""+"";
		log.debug("문자 결합:{}.",s);
		
		s=1+1+"";
		log.debug("문자 결합:{}.",s);//2.
		
		s=""+1+1;
		log.debug("문자 결합:{}.",s);//11.
		
		
		return null;
	}
}
