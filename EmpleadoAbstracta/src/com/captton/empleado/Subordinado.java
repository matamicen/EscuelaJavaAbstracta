package com.captton.empleado;

import java.util.ArrayList;

public class Subordinado extends Empleado {
	
	private ArrayList<String> serviciosPagos;

	public Subordinado() {
		// TODO Auto-generated constructor stub
	}

	public Subordinado(String nombre, int numeroEmpleado) {
		super(nombre, numeroEmpleado);
		serviciosPagos = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Trabajar() {
		// TODO Auto-generated method stub
		return "Yo los Lunes trabajo desde casa";
	}
	
	public void AgregarServicio(String serv)
	{
		this.serviciosPagos.add(serv);
		
	}

	public ArrayList<String> getServiciosPagos() {
		return serviciosPagos;
	}
	
	

}
