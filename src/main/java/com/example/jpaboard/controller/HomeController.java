package com.example.jpaboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {

		// System.out.println(model.getAttribute("loginName"));
		// log 프레임뭐크 사용
		log.trace("loginName: "+model.getAttribute("loginName"));
		log.debug("loginName: "+model.getAttribute("loginName"));
		log.info("loginName: "+model.getAttribute("loginName"));
		return "home";
	}
}
