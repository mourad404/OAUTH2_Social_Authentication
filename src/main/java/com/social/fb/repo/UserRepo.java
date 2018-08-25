package com.social.fb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.fb.model.AppUser;

public interface UserRepo extends JpaRepository<AppUser, Long> {

	public AppUser findByUsername(String username);
}
