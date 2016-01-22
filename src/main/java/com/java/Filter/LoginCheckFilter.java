package com.java.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginCheckFilter implements Filter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain ch) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest hreq = (HttpServletRequest) req;
		HttpServletResponse hres = (HttpServletResponse) res;

		HttpSession ss = hreq.getSession();
		
		if (ss == null) {
			hres.sendRedirect("/loginForm");// 로그인 주소로 이동
		} else {
			String id = (String) ss.getAttribute("ID");
			if (id == null) {
				hres.sendRedirect("/loginForm");// 로그인 주소로 이동
			}
		}
		
		ch.doFilter(req, res);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
