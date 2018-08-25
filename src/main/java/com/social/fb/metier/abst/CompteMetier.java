package com.social.fb.metier.abst;

import com.social.fb.model.AppRole;
import com.social.fb.model.AppUser;

public interface CompteMetier {

	public AppUser ajtUser(AppUser u);

	public AppRole ajtRole(AppRole r);

	public void roleToUser(String username, String roleName);

	public AppUser findByUsername(String username);
}
