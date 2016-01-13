package com.java.standard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/home"})
public class chapterHome {
	
	@RequestMapping(value = "/")
	public String Home() {
		return "home";
	}
}
