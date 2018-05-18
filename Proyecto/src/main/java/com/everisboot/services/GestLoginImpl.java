package com.everisboot.services;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.everisboot.DAO.LoginDAOImpl;
import com.everisboot.models.Login;
@Controller
class GestLoginImpl implements GestLogin{
	
	@Autowired
	LoginDAOImpl implLogin;
	
	
	
    public GestLoginImpl(){
    	
    }
    
	public Iterable<Login> listLogin() {
		return implLogin.findAll();
	}
	
	@Override
	public void saveLogin(Login log,int id,String user, String password) {
		implLogin.save(log);

	}
	
	public Optional<Login> getLogin(int id){
		return implLogin.findById(id);
	}
	
	public void deleteLogin(int id){
		implLogin.deleteById(id);

	}

}
