package com.haust.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.haust.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServiceImpl;
	
	
}
