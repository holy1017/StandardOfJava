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
 *         필터와 레퍼
 *         web.xml 에서 사용함.
 * 
 *         <filter>
 *         <filter-name>필터명</filter-name>
 *         <filter-class>필터클래스</filter-class>
 *         <init-param>
 *         <param-name>매개변수명</param-name>
 *         <param-value>값</param-value>
 *         </init-param>
 *         </filter>
 * 
 *         <filter-mapping>
 *         <filter-name>필터명</filter-name>
 *         <url-pattern>필터패턴</url-pattern>
 *         </filter-mapping>
 */
public class chapter11 implements Filter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 * 필터가 웹 컨테이너에서 삭제될 때 호출된다.
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
	 * 체인을 따라 다음에 존재하는 필터로 이동한다. 체인의 가장 마지막에는 클라이언트가 요청한 최종 자원이 위치한다.
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain ch) throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.debug("doFilter 시작 부분");
		ch.doFilter(req, res);
		log.debug("doFilter 끝 부분");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 * 필터를 초기화할 때 호출한다.
	 */
	@Override
	public void init(FilterConfig con) throws ServletException {
		// TODO Auto-generated method stub
		log.debug("init ");
	}

}
