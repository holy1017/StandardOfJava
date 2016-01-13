package com.java.standard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String chapter2_1() {

		int num;

		num = 1;

		int x = 2;
		int y = 3;

		return null;
	}

	/**
	 * @return
	 * 		���� Ÿ��
	 */
	@RequestMapping(value = "/2")
	// @ResponseBody
	public String chapter2_2() {

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
		// l= -9223372036854775808;
		// l= 9223372036854775807;

		// 4����Ʈ,�Ǽ���
		float f;

		// 8����Ʈ,�Ǽ���
		double d;

		return null;
	}

	/**
	 * @return
	 * 		������
	 */
	@RequestMapping(value = "/2/3")
	// @ResponseBody
	public String chapter2_2_3() {
		
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
		
		return null;
	}

}
