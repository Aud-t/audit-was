package com.yu.hannoon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class LogTestController {

	@GetMapping("/error")
	public String errorTest() {
		throw new RuntimeException("Slack ERROR 테스트입니다.");
	}
}
