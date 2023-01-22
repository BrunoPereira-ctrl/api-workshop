package com.educandoweb.course.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.educandoweb.course.security.UserSS;

public class perfilUserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}

}
