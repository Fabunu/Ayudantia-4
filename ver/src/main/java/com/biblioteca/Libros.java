package com.biblioteca;

public class Libros {
    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private int cantidadDisponible;
    private boolean disponible;
    
    public Libros(String titulo, String autor, String genero, String iSBN, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        ISBN = iSBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = cantidadDisponible > 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = cantidadDisponible > 0;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    } 

    public void prestar() {
        if(cantidadDisponible > 0) {
            cantidadDisponible--;
            if (cantidadDisponible == 0) {
                disponible = false; // lo marca como no disponible
            }
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("No hay copias del libro disponibles para prestar");
        }

    }

    public void devolver() {
        cantidadDisponible++;
        if(cantidadDisponible > 0) {
            disponible = true; 
        }
        System.out.println("Libro devuelto: " + titulo);
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
    }
    
}
