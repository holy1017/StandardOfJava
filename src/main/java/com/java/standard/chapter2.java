package com.java.standard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String chapter2_1(RedirectAttributes rd) {

		int num;

		num = 1;

		int x = 2;
		int y = 3;

		rd.addFlashAttribute("result", "정상 작동. 출력되는건 없음. chapter2_1");
		return "redirect:../";
	}

	/**
	 * @return
	 * 		변수 타입
	 */
	@RequestMapping(value = "/2")
	// @ResponseBody
	public String chapter2_2(RedirectAttributes rd) {

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
		l = -9223372036854775808L;// L을 붙여야 long으로 인식
		l = 9223372036854775807L;

		// 4바이트,실수형
		float f;

		// 8바이트,실수형
		double d;

		rd.addFlashAttribute("result", "정상 작동. 출력되는건 없음. chapter2_2");
		return "redirect:../";
	}

	/**
	 * @return
	 * 		문자형
	 */
	@RequestMapping(value = "/2/3")
	// @ResponseBody
	public String chapter2_2_3(RedirectAttributes rd) {

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

		rd.addFlashAttribute("result", "콘솔을 확인해주세요. chapter2_2_3");
		return "redirect:../../";
	}

	/**
	 * @param rd
	 * @return
	 * 		숫자 선언
	 */
	@RequestMapping(value = "/2/4")
	// @ResponseBody
	public String chapter2_2_4(RedirectAttributes rd) {

		// 1바이트
		byte b;
		b = -128;
		log.debug("byte:{}",b);
		b = 127;
		log.debug("byte:{}",b);

		// 2바이트
		short s;
		s = -32768;
		log.debug("short:{}",s);
		s = 32767;
		log.debug("short:{}",s);

		// 4바이트
		int i;
		i = -2147483648;
		log.debug("int:{}",i);
		i = 2147483647;
		log.debug("int:{}",i);
		
		// 8바이트
		long l;
		l = -9223372036854775808L;// L을 붙여야 long으로 인식
		log.debug("long:{}",l);
		l = 9223372036854775807L;
		log.debug("long:{}",l);

		// 4바이트,실수형
		float f;

		// 8바이트,실수형
		double d;
		
		//16진수로 선언
		i = 0x1;
		log.debug("0x1:{}",i);
		i = 0xffffffff;
		log.debug("0xffffffff:{}",i);
		i = 0x7fffffff;
		log.debug("0x7fffffff:{}",i);
		i = 0x80000000;
		log.debug("0x80000000:{}",i);
		
		rd.addFlashAttribute("result", "콘솔을 확인해주세요. chapter2_2_4");
		return "redirect:../../";
	}

}
