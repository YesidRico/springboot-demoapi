package com.example.demoapi.resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountResource {
	
	@GetMapping("/authenticate")
	public String isAuthenticate(HttpServletRequest httpServletRequest) {
		System.out.println("llegue");
		return httpServletRequest.getRemoteUser();
	}
}
