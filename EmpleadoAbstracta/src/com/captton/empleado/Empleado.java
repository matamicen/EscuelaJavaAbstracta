package com.captton.empleado;

public abstract class Empleado {


	
	protected String nombre;
	protected int numeroEmpleado;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre, int numeroEmpleado){
		this.nombre = nombre;
		this.numeroEmpleado = numeroEmpleado;
	}

	
	public String Almorzar() {
		return "ñam ñam ñam";
	}
	
	public abstract String Trabajar();
	
	public final String TrabajarHorasExtras(){
		return "Tengo sueeño, dejenme ir";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	
	

}
