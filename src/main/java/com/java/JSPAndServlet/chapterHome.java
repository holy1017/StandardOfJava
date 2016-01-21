package com.java.JSPAndServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = { "/", "/home" })
public class chapterHome {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

/*	@RequestMapping(value = "/")
	public String Home() {
		log.debug("Home");
		return "home";
	}*/

	@RequestMapping(value = "/")//, method = RequestMethod.GET
	public String HomeForward(@RequestParam(value="page", required=false) String page) {
		//@RequestParam("page") String page
		
		log.debug("HomeForward:"+page);
		
		if (page != null) {
			return "forward:" + page;
		}/**/

		return "home";
	}

	@RequestMapping(value = "/{url}")
	public String HomePath(@PathVariable String url) {
		
		log.debug("HomePath:"+url);
		
		return url;
	}
}
