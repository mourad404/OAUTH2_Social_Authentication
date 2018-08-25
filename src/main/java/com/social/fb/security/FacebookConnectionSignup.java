package com.social.fb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;

import com.social.fb.metier.abst.CompteMetier;
import com.social.fb.model.AppUser;
import com.social.fb.repo.UserRepo;

@Service
public class FacebookConnectionSignup implements ConnectionSignUp {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CompteMetier cm;

	@Override
	public String execute(Connection<?> connection) {
		System.out.println("signup === ");
		AppUser userExist = userRepo.findByUsername(connection.getDisplayName());
		if (userExist == null) {
			final AppUser user = new AppUser();
			user.setUsername(connection.getDisplayName());
			user.setPassword("1234");
			user.setEnabled(true);
			cm.ajtUser(user);
		}
		return connection.getDisplayName();
	}

}
