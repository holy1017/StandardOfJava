package com.java.JSPAndServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author lilly_000
 * JSPAndServlet 7�� �ͽ������� ���
 */
@Controller
@RequestMapping(value = "/ch7/*")
public class chapter07 {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/1")
	// @ResponseBody
	public String chapter2_1(RedirectAttributes rd) {

		int num;

		num = 1;

		int x = 2;
		int y = 3;

		rd.addFlashAttribute("result", "���� �۵�. ��µǴ°� ����. chapter2_1");
		return "redirect:../";
	}
}
