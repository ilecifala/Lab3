package com.company;

public class Libro {
    private String title;
    private double price;
    private int stock;
    private Autor autor;


    public Libro (String title, double price, int stock, Autor autor) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitle (){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public Autor getAutor()
    {
        return autor;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public void setAutor(Autor autor){
        this.autor=autor;
    }

    public void imprimirLibro ()
    {
        System.out.println("Título: "+title+", precio: "+price+", stock: "+stock);
        autor.imprimirAutor();
    }

    public void mensaje()
    {
        System.out.println("El libro "+title+", de "+autor.getName()+" se vende a "+price+" pesos.");
    }
}
