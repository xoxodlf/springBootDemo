package com.example.demoPj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.example.demoPj.domain.Users;
import com.example.demoPj.domain.UsersMainResponseDto;

public interface UsersService {
	public List<Users> getUserByUserNo(int userNo);
	public List<UsersMainResponseDto> finAllDesc();
}
