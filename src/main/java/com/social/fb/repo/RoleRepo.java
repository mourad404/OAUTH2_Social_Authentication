package com.social.fb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.fb.model.AppRole;

public interface RoleRepo extends JpaRepository<AppRole, Long> {

	public AppRole findByRoleName(String roleName);
}
