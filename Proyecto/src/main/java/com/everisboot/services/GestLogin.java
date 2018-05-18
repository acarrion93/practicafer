package com.everisboot.services;

import java.util.Date;
import java.util.Optional;

import com.everisboot.models.Login;

public interface GestLogin {
	
	public Iterable<Login> listLogin();
	public void saveLogin(Login log,int id,String user, String password);
	public Optional<Login> getLogin(int id);
	public void deleteLogin(int id);
	

}
