package com.everisboot.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimientos")

@SuppressWarnings("serial")
public class Movimiento implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int idmovimiento;
	public int numerocuenta;
	public Date fecha;
	public int cantidad;
	public String operacion;
	public Movimiento() {
		super();
	}
	public Movimiento(int idmovimiento, int numerocuenta, Date fecha, int cantidad, String operacion) {
		super();
		this.idmovimiento = idmovimiento;
		this.numerocuenta = numerocuenta;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.operacion = operacion;
	}
	public int getIdmovimiento() {
		return idmovimiento;
	}
	public void setIdmovimiento(int idmovimiento) {
		this.idmovimiento = idmovimiento;
	}
	public int getNumerocuenta() {
		return numerocuenta;
	}
	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	@Override
	public String toString() {
		return "Movimiento [idmovimiento=" + idmovimiento + ", numerocuenta=" + numerocuenta + ", fecha=" + fecha
				+ ", cantidad=" + cantidad + ", operacion=" + operacion + "]";
	}
	
}
