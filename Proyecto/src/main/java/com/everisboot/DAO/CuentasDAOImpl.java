package com.everisboot.DAO;

import org.springframework.data.repository.CrudRepository;

import com.everisboot.models.Cuenta;



public interface CuentasDAOImpl extends CrudRepository<Cuenta, Integer> {
	
	
}