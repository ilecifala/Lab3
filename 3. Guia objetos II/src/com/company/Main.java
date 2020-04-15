package com.company;

public class Main {

    public static void main(String[] args) {
	Autor au=new Autor("Joshua Bloch","joshua@email.com",'M');
	//au.imprimirAutor();
        System.out.println(au);
	Libro lib=new Libro("Effective Java",450,150,au);
	// lib.imprimirLibro();
	lib.setPrice(500);
	lib.setStock(lib.getStock()+50);
	lib.mensaje();

    }
}
