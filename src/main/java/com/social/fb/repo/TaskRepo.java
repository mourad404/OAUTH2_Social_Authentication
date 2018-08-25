package com.social.fb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.fb.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
