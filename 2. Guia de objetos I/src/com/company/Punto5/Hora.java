package com.company.Punto5;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora (int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora () {
        return hora;
    }

    public int getMinutos () {
        return minutos;
    }

    public int getSegundos () {
        return segundos;
    }

    public void setHora (int hora)
    {
        if (hora<0 || hora>23)
            System.out.println("Por favor, ingrese una hora válida.");
        else
            this.hora=hora;
    }

    public void setMinutos (int minutos)
    {
        if (minutos<0 || minutos>59)
            System.out.println("Por favor, ingrese minutos válidos.");
        else
            this.minutos=minutos;
    }

    public void setSegundos (int segundos){
        if (segundos<0 || segundos>59)
            System.out.println("Por favor, ingrese segundos válidos.");
        else
            this.segundos=segundos;
    }

    public void mostrarHora (){
        System.out.println(String.format("%02d",hora)+":"+String.format("%02d",minutos) +":"+String.format("%02d",segundos));
    }

    public Hora avanzar ()
    {
        segundos++;
        return this;
    }

    public Hora retroceder ()
    {
        segundos--;
        return this;
    }

}
