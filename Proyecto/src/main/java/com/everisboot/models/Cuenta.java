package com.everisboot.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")

@SuppressWarnings("serial")
public class Cuenta implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int numerocuenta;
	public String nombrecliente;
	public int saldo;
	
	
	public Cuenta() {
		super();
	}

	public Cuenta(int numerocuenta, String nombrecliente, int saldo) {
		super();
		this.numerocuenta = numerocuenta;
		this.nombrecliente = nombrecliente;
		this.saldo = saldo;
	}

	public int getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numerocuenta=" + numerocuenta + ", nombrecliente=" + nombrecliente + ", saldo=" + saldo + "]";
	}
	
	
	

	
}
