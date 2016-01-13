package com.java.standard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String chapter2_EX_2_1(Model model,RedirectAttributes rd) {

		char ch = 'A';
		int code = (int) ch;

		log.debug("char : {}", ch); // A
		log.debug("int code : {}", code); // 65

		//model.addAttribute("result", "콘솔을 확인해주세요. chapter2_EX_2_1");
		rd.addFlashAttribute("result", "콘솔을 확인해주세요. chapter2_EX_2_1");
		return "redirect:../";
	}

	/**
	 * @return
	 * 		문자형 EX_2_2
	 */
	@RequestMapping(value = "/2")
	// @ResponseBody
	public String chapter2_EX_2_2(RedirectAttributes rd) {

		int code = 65;
		char ch = (char) code;

		log.debug("int code : {}", code); // 65
		log.debug("char : {}", ch); // A

		rd.addFlashAttribute("result", "콘솔을 확인해주세요. chapter2_EX_2_2");
		return "redirect:../";
	}

	/**
	 * @return
	 * 		문자 결합
	 */
	@RequestMapping(value = "/3")
	// @ResponseBody
	public String chapter2_EX_2_3(RedirectAttributes rd) {

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
		
		rd.addFlashAttribute("result", "콘솔을 확인해주세요. chapter2_EX_2_3");
		return "redirect:../";
	}
}
