package com.everisboot.DAO;

import org.springframework.data.repository.CrudRepository;

import com.everisboot.models.Login;



public interface LoginDAOImpl extends CrudRepository<Login, Integer> {
	
	
}