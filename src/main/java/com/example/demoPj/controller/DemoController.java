package com.example.demoPj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoPj.domain.UsersMainResponseDto;
import com.example.demoPj.service.UsersService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DemoController {
	
	private UsersService usersService;
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("inGet");
		return "HelloWorld";
	}
	
	@PostMapping("/usersPost")
	public String usersPost() {
		System.out.println("inPost");
		StringBuffer sb = new StringBuffer();
		List<UsersMainResponseDto> li = usersService.finAllDesc();
		for(UsersMainResponseDto user : li) {
			sb.append(user.toString());
		}
		return sb.toString();
	}
	
	@GetMapping("/usersGet")
	public String usersGet() {
		System.out.println("inGET");
		StringBuffer sb = new StringBuffer();
		List<UsersMainResponseDto> li = usersService.finAllDesc();
		for(UsersMainResponseDto user : li) {
			sb.append(user.toString());
		}
		return sb.toString();
	}
}
