package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String miBiblioteca;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.miBiblioteca = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        for (Libro l : libros) {
            if (l.getISBN().equals(libro.getISBN())) {
                l.setCantidadDisponible(l.getCantidadDisponible() + libro.getCantidadDisponible());
                System.out.println("El libro ya existe, aumenta la cantidad disponible");
                return;
            }
        }
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles: ");
        for (Libro l : libros) {
            if (l.isDisponible()) {
                l.mostrarInfo();
            }
        }
    }
    
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        System.out.println("No se encontro el libro con el titulo: " + titulo);
        return null;
    }

    public ArrayList<Libro> buscarLibroPorAutor(String autor) {
        ArrayList<Libro> librosPorAutor = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                librosPorAutor.add(l);
            }
        }
        if (librosPorAutor.isEmpty()) {
            System.out.println("No se encontraron librps del autor: " + autor);
        }
        return librosPorAutor;
    }

    public void eliminarLibro(String titulo) {
        try {
            Libro libro = buscarLibroPorTitulo(titulo);
            if (libro != null && libro.getCantidadDisponible() == 0) {
                libros.remove(libro);
                System.out.println("El libro ha sido eliminado");
            } else {
                System.out.println("No se puede eliminar el libro porque hay copias disponibles");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el libro: " + e.getMessage());
        }
    }

    public void prestarLibro(String titulo) {
        try {
            Libro libro = buscarLibroPorTitulo(titulo);
            if (libro != null) {
                libro.prestar();
            } else {
                System.out.println("El libro no esta disponible");
            }
        } catch (Exception e) {
            System.out.println("Error al prestar el libro: " + e.getMessage());
        }
    }

    public void devolverLibro(String titulo) {
        try {
            Libro libro = buscarLibroPorTitulo(titulo);
            if (libro != null) {
                libro.devolver();
            } else {
                System.out.println("No se encontro el libro para devolver");
            }
        } catch (Exception e) {
            System.out.println("Error al devolver el libro: " + e.getMessage());
        }
    }
}

