package com.captton.empleado;

public class Gerente extends Empleado {
	
	private int bonoAnual;

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nombre, int numeroEmpleado) {
		super(nombre, numeroEmpleado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Trabajar() {
		// TODO Auto-generated method stub
		return "Yo los viernes trabajo desde casa";
	} 
	
	public String Almorzar() {
		return "ñam ñam ñam";
	}

	public int getBonoAnual() {
		return bonoAnual;
	}

	public void setBonoAnual(int bonoAnual) {
		this.bonoAnual = bonoAnual;
	}
	
	

}
