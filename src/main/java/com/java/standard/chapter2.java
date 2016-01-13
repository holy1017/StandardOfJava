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
 *         ����
 */
@Controller
@RequestMapping(value = "/ch2/*")
public class chapter2 {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * @return
	 * 		����
	 */
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

	/**
	 * @return
	 * 		���� Ÿ��
	 */
	@RequestMapping(value = "/2")
	// @ResponseBody
	public String chapter2_2(RedirectAttributes rd) {

		// 1����Ʈ,����
		boolean bl;
		bl = true;
		bl = false;

		// 2����Ʈ,������
		char c;
		c = 'A'; // ���� ���� �Է�
		c = '\u0041'; // �����ڵ� ���. \u0041�� 'A'�� ����

		// 1����Ʈ
		byte b;
		b = -128;
		b = 127;

		// 2����Ʈ
		short s;
		s = -32768;
		s = 32767;

		// 4����Ʈ
		int i;
		i = -2147483648;
		i = 2147483647;

		// 8����Ʈ
		long l;
		l = -9223372036854775808L;// L�� �ٿ��� long���� �ν�
		l = 9223372036854775807L;

		// 4����Ʈ,�Ǽ���
		float f;

		// 8����Ʈ,�Ǽ���
		double d;

		rd.addFlashAttribute("result", "���� �۵�. ��µǴ°� ����. chapter2_2");
		return "redirect:../";
	}

	/**
	 * @return
	 * 		������
	 */
	@RequestMapping(value = "/2/3")
	// @ResponseBody
	public String chapter2_2_3(RedirectAttributes rd) {

		char s;

		s = '\t';
		log.debug("��:{}.", s);

		s = '\b';
		log.debug("�齺���̽�:{}.", s);

		s = '\f';
		log.debug("���ǵ�:{}.", s);

		s = '\n';
		log.debug("������:{}.", s);

		s = '\r';
		log.debug("ĳ��������:{}.", s);

		s = '\\';
		log.debug("��������:{}.", s);

		s = '\'';
		log.debug("��������ǥ:{}.", s);

		s = '\"';
		log.debug("ū����ǥ:{}.", s);

		s = '\u0041';
		log.debug("�����ڵ�:{}.", s);

		rd.addFlashAttribute("result", "�ܼ��� Ȯ�����ּ���. chapter2_2_3");
		return "redirect:../../";
	}

	/**
	 * @param rd
	 * @return
	 * 		���� ����
	 */
	@RequestMapping(value = "/2/4")
	// @ResponseBody
	public String chapter2_2_4(RedirectAttributes rd) {

		// 1����Ʈ
		byte b;
		b = -128;
		log.debug("byte:{}",b);
		b = 127;
		log.debug("byte:{}",b);

		// 2����Ʈ
		short s;
		s = -32768;
		log.debug("short:{}",s);
		s = 32767;
		log.debug("short:{}",s);

		// 4����Ʈ
		int i;
		i = -2147483648;
		log.debug("int:{}",i);
		i = 2147483647;
		log.debug("int:{}",i);
		
		// 8����Ʈ
		long l;
		l = -9223372036854775808L;// L�� �ٿ��� long���� �ν�
		log.debug("long:{}",l);
		l = 9223372036854775807L;
		log.debug("long:{}",l);

		// 4����Ʈ,�Ǽ���
		float f;

		// 8����Ʈ,�Ǽ���
		double d;
		
		//16������ ����
		i = 0x1;
		log.debug("0x1:{}",i);
		i = 0xffffffff;
		log.debug("0xffffffff:{}",i);
		i = 0x7fffffff;
		log.debug("0x7fffffff:{}",i);
		i = 0x80000000;
		log.debug("0x80000000:{}",i);
		
		rd.addFlashAttribute("result", "�ܼ��� Ȯ�����ּ���. chapter2_2_4");
		return "redirect:../../";
	}

}
