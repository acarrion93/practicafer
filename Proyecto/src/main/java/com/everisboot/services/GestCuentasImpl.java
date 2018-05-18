package com.everisboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.everisboot.DAO.CuentasDAOImpl;
import com.everisboot.models.Cuenta;
@Controller
class GestCuentasImpl implements GestCuentas{	
	
	@Autowired
	CuentasDAOImpl implCuenta;	
	
    public GestCuentasImpl(){
    	
    }

	@Override
	public Cuenta autenticar(int numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizaSaldo(double cantidad, int numeroCuenta) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Iterable<Cuenta> listCuentas() {
		return implCuenta.findAll();
	}
	
	@Override
	public void saveCuentas(Cuenta cuent,int numerocuenta,String nombrecliente, int saldo) {
		implCuenta.save(cuent);

	}
	
	public Optional<Cuenta> getCuenta(int numerocuenta){
		return implCuenta.findById(numerocuenta);
	}
	
	public void deleteCuenta(int numerocuenta){
		implCuenta.deleteById(numerocuenta);

	}

}
