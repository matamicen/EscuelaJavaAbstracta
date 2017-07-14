package com.captton.programa;

import java.util.ArrayList;

import com.captton.empleado.Empleado;
import com.captton.empleado.Gerente;
import com.captton.empleado.Subordinado;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente("Jose",18888999);
		System.out.println("Posicion Gerente" + " Nombre:" + g1.getNombre());
		System.out.println(g1.Almorzar());
		System.out.println(g1.Trabajar());
		System.out.println(g1.TrabajarHorasExtras());
		
		Subordinado s1 = new Subordinado("Pablo",24587416);
		s1.AgregarServicio("Pago de Internet Home");
		s1.AgregarServicio("Pago de Gimansio");
		
		System.out.println("Posicion Subordinado" + " Nombre:" + s1.getNombre());
		
		
		System.out.println(s1.Almorzar());
		System.out.println(s1.Trabajar());
		System.out.println(s1.TrabajarHorasExtras());
		
		System.out.println("Los servicios pagos son:");
		for(String ser: s1.getServiciosPagos())
		{
			System.out.println(ser + " ");
			
		}
		
		


	}

}
