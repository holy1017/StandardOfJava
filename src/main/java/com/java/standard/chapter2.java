package com.java.standard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.HomeController;

/**
 * @author lilly_000
 *         변수
 */
@Controller
@RequestMapping(value = "/ch2/*")
public class chapter2 {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * @return
	 * 		변수
	 */
	@RequestMapping(value = "/1")
	// @ResponseBody
	public String chapter2_1() {

		int num;

		num = 1;

		int x = 2;
		int y = 3;

		return null;
	}

	/**
	 * @return
	 * 		변수 타입
	 */
	@RequestMapping(value = "/2")
	// @ResponseBody
	public String chapter2_2() {

		// 1바이트,논리형
		boolean bl;
		bl = true;
		bl = false;

		// 2바이트,문자형
		char c;
		c = 'A'; // 문자 직접 입력
		c = '\u0041'; // 유니코드 방식. \u0041는 'A'와 같음

		// 1바이트
		byte b;
		b = -128;
		b = 127;

		// 2바이트
		short s;
		s = -32768;
		s = 32767;

		// 4바이트
		int i;
		i = -2147483648;
		i = 2147483647;

		// 8바이트
		long l;
		// l= -9223372036854775808;
		// l= 9223372036854775807;

		// 4바이트,실수형
		float f;

		// 8바이트,실수형
		double d;

		return null;
	}

	/**
	 * @return
	 * 		문자형
	 */
	@RequestMapping(value = "/2/3")
	// @ResponseBody
	public String chapter2_2_3() {
		
		char s;
		
		s = '\t';
		log.debug("탭:{}.", s);
		
		s = '\b';
		log.debug("백스페이스:{}.", s);
		
		s = '\f';
		log.debug("폼피드:{}.", s);
		
		s = '\n';
		log.debug("뉴라인:{}.", s);
		
		s = '\r';
		log.debug("캐리지리턴:{}.", s);
		
		s = '\\';
		log.debug("역슬레쉬:{}.", s);
		
		s = '\'';
		log.debug("작은따음표:{}.", s);
		
		s = '\"';
		log.debug("큰따음표:{}.", s);
		
		s = '\u0041';
		log.debug("유니코드:{}.", s);
		
		return null;
	}

}
