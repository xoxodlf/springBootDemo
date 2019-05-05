package com.example.demoPj.domain;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Long> {
	@Query("SELECT u " +
            "FROM Users u " +
            "ORDER BY u.uuid DESC")
	Stream<Users> findAllDesc();
}
