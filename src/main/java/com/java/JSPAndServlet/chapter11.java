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

@Controller
@RequestMapping(value = "/ch11/*")
public class chapter11 implements Filter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	PrintWriter wr;

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
		wr.println("destroy");
		wr.close();
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
		
//		wr.println("doFilter:getRemoteAddr:"+req.getRemoteAddr());
//		wr.println("doFilter:getContentType:"+req.getContentType());
		
		GregorianCalendar now=new GregorianCalendar();

		wr.printf("%TF %TT ", now,now);
		wr.printf("%s ", req.getRemoteAddr());
		
		ch.doFilter(req, res);
		
		wr.printf("%s ", req.getContentType());
		wr.println();
		
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
		log.debug("init 메소드 실행");

		String fileName = con.getInitParameter("FILE_NAME");
		if (fileName == null) {
			throw new ServletException("로그 파일 못찿음.");
		}
		try {
			wr = new PrintWriter(new FileWriter(fileName, true), true);
		} catch (IOException e) {
			// TODO: handle exception
			throw new ServletException("로그 파일 못열음.");
		}

		wr.println("init");
	}

	/**
	 * @param re
	 * @return
	 * 		필터 부르기 예제용
	 */
	@RequestMapping(value = "/test/*")
	public String test(RedirectAttributes re) {
		log.debug("test 메소드 실행");
		re.addFlashAttribute("result", this.getClass() + "클래스의 test메소드에서 실행됨");
		return "redirect:../../";
	}
}
