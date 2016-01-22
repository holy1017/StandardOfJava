package com.java.JSPAndServlet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author lilly_000
 *         ���Ϳ� ����
 *         web.xml ���� �����.
 * 
 *         <filter>
 *         <filter-name>���͸�</filter-name>
 *         <filter-class>����Ŭ����</filter-class>
 *         <init-param>
 *         <param-name>�Ű�������</param-name>
 *         <param-value>��</param-value>
 *         </init-param>
 *         </filter>
 * 
 *         <filter-mapping>
 *         <filter-name>���͸�</filter-name>
 *         <url-pattern>��������</url-pattern>
 *         </filter-mapping>
 */

@Controller
@RequestMapping(value = "/ch11/*")
public class chapter11 implements Filter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	PrintWriter wr;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 * ���Ͱ� �� �����̳ʿ��� ������ �� ȣ��ȴ�.
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log.debug("destroy");
		wr.println("destroy");
		wr.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 * ü���� ���� ������ �����ϴ� ���ͷ� �̵��Ѵ�. ü���� ���� ���������� Ŭ���̾�Ʈ�� ��û�� ���� �ڿ��� ��ġ�Ѵ�.
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain ch) throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.debug("doFilter ���� �κ�");
		
//		wr.println("doFilter:getRemoteAddr:"+req.getRemoteAddr());
//		wr.println("doFilter:getContentType:"+req.getContentType());
		
		GregorianCalendar now=new GregorianCalendar();

		wr.printf("%TF %TT ", now,now);
		wr.printf("%s ", req.getRemoteAddr());
		
		ch.doFilter(req, res);
		
		wr.printf("%s ", req.getContentType());
		wr.println();
		
		log.debug("doFilter �� �κ�");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 * ���͸� �ʱ�ȭ�� �� ȣ���Ѵ�.
	 */
	@Override
	public void init(FilterConfig con) throws ServletException {
		// TODO Auto-generated method stub
		log.debug("init �޼ҵ� ����");

		String fileName = con.getInitParameter("FILE_NAME");
		if (fileName == null) {
			throw new ServletException("�α� ���� ���O��.");
		}
		try {
			wr = new PrintWriter(new FileWriter(fileName, true), true);
		} catch (IOException e) {
			// TODO: handle exception
			throw new ServletException("�α� ���� ������.");
		}

		wr.println("init");
	}

	/**
	 * @param re
	 * @return
	 * 		���� �θ��� ������
	 */
	@RequestMapping(value = "/test/*")
	public String test(RedirectAttributes re) {
		log.debug("test �޼ҵ� ����");
		re.addFlashAttribute("result", this.getClass() + "Ŭ������ test�޼ҵ忡�� �����");
		return "redirect:../../";
	}
}
