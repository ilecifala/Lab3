package com.company.Punto3;

public class ItemVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precio;


    public int getIdentificador () {
        return identificador;
    }

    public void setIdentificador (int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad () {
        return cantidad;
    }

    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio () {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    //métodos
    public double precioTotal ()
    {
        return (this.precio*this.cantidad);
    }

    public void mostrarItem ()
    {
        System.out.println("ItemVenta [Id: "+this.identificador+", descripción: "+this.descripcion+", cantidad: "+this.cantidad+", precio unitario: "+this.precio+", precio total: "+precioTotal());
    }
}
