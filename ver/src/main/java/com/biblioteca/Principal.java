package com.biblioteca;

public class Principal {
    public static void main(String[] args) {
        Biblioteca mBiblioteca = new Biblioteca("Biblioteca Central");
        String titulo = "Carrie";
        String autor = "Stephen King";
        String genero = "Novela";
        String ISBN = "7894";
        int cantidadDisponible = 5;
        boolean disponible = cantidadDisponible > 0;
        //Agregar libro
        Libro libro = new Libro(titulo, autor, genero, ISBN, cantidadDisponible, disponible);
        
        mBiblioteca.agregarLibro(libro);

        //mostrar libros dispo
        mBiblioteca.mostrarLibrosDisponibles();
        //Prestar
        mBiblioteca.prestarLibro("Carrie");
        //devolver
        mBiblioteca.devolverLibro("Carrie");
        //eliminar
        mBiblioteca.eliminarLibro("Carrie");
    }
}
