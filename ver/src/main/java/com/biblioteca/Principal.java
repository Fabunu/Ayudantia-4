package com.biblioteca;

public class Principal {
    public static void main(String[] args) {
        Biblioteca mBiblioteca = new Biblioteca("Biblioteca Central");
    
        //Agregar libro
        Libro libro1 = new Libro("Carrie", "Stephen King", "Novela", "7894", 5, true);
        Libro libro2 = new Libro("El Hobbit", "J.R.R. Tolkien", "Fantasía", "1234", 3, true);
        Libro libro3 = new Libro("1984", "George Orwell", "Distopía", "5678", 0, false);
        Libro libro4 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Ficción", "9101", 2, true);
        
        mBiblioteca.agregarLibro(libro1);
        mBiblioteca.agregarLibro(libro2);
        mBiblioteca.agregarLibro(libro3);
        mBiblioteca.agregarLibro(libro4);
        System.out.println("-----------------------");
        //mostrar libros dispo
        mBiblioteca.mostrarLibrosDisponibles();
        System.out.println("-----------------------");
        //Prestar
        mBiblioteca.prestarLibro("Carrie");
        mBiblioteca.mostrarLibrosDisponibles();
        System.out.println("-----------------------");
        //devolver
        mBiblioteca.devolverLibro("Carrie");
        mBiblioteca.mostrarLibrosDisponibles();
        System.out.println("-----------------------");
        //buscar un libro por titulo
        mBiblioteca.buscarLibroPorTitulo("1984");
        System.out.println("-----------------------");
        //buscar por autor
        mBiblioteca.buscarLibroPorAutor("Stephen King");
        System.out.println("-----------------------");
        //eliminar
        mBiblioteca.eliminarLibro("Cien años de soledad");
        mBiblioteca.mostrarLibrosDisponibles();
        System.out.println("-----------------------");
    }
}
