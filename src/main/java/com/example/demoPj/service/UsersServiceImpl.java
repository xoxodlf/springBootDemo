package com.example.demoPj.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demoPj.dao.UsersDao;
import com.example.demoPj.domain.Users;
import com.example.demoPj.domain.UsersMainResponseDto;
import com.example.demoPj.domain.UsersRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {
	private UsersRepository usersRepository;
	
	@Override
	public List<Users> getUserByUserNo(int userNo) {
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<UsersMainResponseDto> finAllDesc(){
		return usersRepository.findAllDesc()
				.map(UsersMainResponseDto::new)
				.collect(Collectors.toList());
	}

}
