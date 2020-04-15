package com.company;

public class Autor {
    private String name;
    private String email;
    private char gender;
    public Autor (String name, String email, char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName ()
    {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(char gender)
    {
        this.gender=gender;
    }

    public void imprimirAutor (){
        System.out.println("Nombre: "+this.name+", e-mail: "+this.email+", género: "+this.gender);
    }

}
