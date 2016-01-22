package com.java.JSPAndServlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class chapter11 implements Filter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

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
		ch.doFilter(req, res);
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
		log.debug("init ");
	}

}
