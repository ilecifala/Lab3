package com.company;

import com.company.Punto1.Rectangulo;
import com.company.Punto2.Empleado;
import com.company.Punto3.ItemVenta;
import com.company.Punto4.Cuenta;
import com.company.Punto5.Hora;


public class Main {

    public static void main(String[] args) {
    	//punto 1

	Rectangulo r=new Rectangulo();
	r.setAlto(1.0F);
	r.setAncho(1.0F);
	r.area();
	r.perimetro();
	System.out.println("Alto: "+r.getAlto()+", ancho: "+r.getAncho());
	System.out.println("Área: "+r.area()+", perímetro: "+r.perimetro());
	r.setAncho(3.5F);
	r.setAlto(2.0F);
	System.out.println("Alto: "+r.getAlto()+", ancho: "+r.getAncho());
	System.out.println("Área: "+r.area()+", perímetro: "+r.perimetro());
/*
	//punto 2
	Empleado e=new Empleado();
	e.setNombre("Carlos");
	e.setApellido("Gutiérrez");
	e.setDni(23456345);
	e.setSalario(25000);

	Empleado f=new Empleado();
	f.setNombre("Ana");
	f.setApellido("Sánchez");
	f.setSalario(27500);
	f.setDni(34234123);

	e.mostrarEmpleado();
	f.mostrarEmpleado();

	e.aumento(15);
	System.out.println("Nuevo salario de Carlos: "+e.getSalario());
	System.out.println("Salario anual de Carlos: "+e.calcularSalarioAnual());

		//punto 3
	ItemVenta item=new ItemVenta();
	item.setPrecio(16.5);
	item.setCantidad(12);
	item.setDescripcion("Terrabusi clásico");
	item.setIdentificador(1234);
	item.mostrarItem();

		//punto 4 HACER

		//punto 5
    Hora h=new Hora(13,4,22);
    h.mostrarHora();
    h=h.avanzar();
    h.mostrarHora();
    h=h.retroceder();
    h.mostrarHora();*/
    }
}
