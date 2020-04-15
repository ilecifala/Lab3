package com.company.Punto2;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public int getDni () {
        return this.dni;
    }
    public void setDni (int dni)
    {
        this.dni=dni;
    }

    public String getNombre ()
    {
        return this.nombre;
    }
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }

    public String getApellido ()
    {
        return this.apellido;
    }
    public void setApellido (String apellido)
    {
        this.apellido=apellido;
    }

    public double getSalario ()
    {
        return this.salario;
    }
    public void setSalario (double salario)
    {
        this.salario=salario;
    }

    //metodos
    public double calcularSalarioAnual ()
    {
        return (this.salario*12);
    }
    public void mostrarEmpleado ()
    {
        System.out.println("Empleado [DNI:"+this.dni+", nombre: "+this.nombre+", apellido: "+this.apellido+", salario: "+this.salario+"]");
    }

    public void aumento (int porcentaje)
    {
        double v = (this.salario * porcentaje) / 100;
        this.salario+=v;
    }
}
