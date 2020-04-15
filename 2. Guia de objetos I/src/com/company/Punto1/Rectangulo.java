package com.company.Punto1;

public class Rectangulo {
    private float ancho;
    private float alto;
//getters y setters son parte de los métodos?
    public float getAncho ()
    {
        return this.ancho;
    }

    public void setAncho (float ancho)
    {
        this.ancho=ancho;
    }

    public float getAlto ()
    {
        return this.alto;
    }

    public void setAlto (float alto)
    {
        this.alto=alto;
    }

    //área
    public float area ()
    {
        float result=this.ancho*this.alto;
        return result;
    }

    //perímetro
    public float perimetro (){
        float result=(this.ancho+this.alto)*2;
        return result;
    }

}
