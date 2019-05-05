package com.example.demoPj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demoPj.domain.Users;

@Repository
public interface UsersDao  extends JpaRepository<Users, Integer>{
	List<Users> findAll();
	
	@Query(nativeQuery = true, value = "select c.userno from users c where c.userno = :userno")
	List<Users> findByUserNo(@Param("userno") int userNo);
}
