
package tarea.pkg3.pkg3.pkg1.lpoo;

import java.util.ArrayList;
import java.util.Date;

public class Resena extends Publicacion implements Calificable, Categorizable {
    private ArrayList<Integer> calificaciones;
    private String categoria;

    public Resena(String idPublicacion, String autor, String contenido, Date fecha) {
        super(idPublicacion, autor, contenido, fecha);
        this.calificaciones = new ArrayList<>();
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo reseña: " + contenido);
    }

    @Override
    public void editarContenido(String nuevoContenido) {
        this.contenido = nuevoContenido;
        System.out.println("Contenido actualizado: " + nuevoContenido);
    }

    @Override
    public String mostrarInfo() {
        return "Reseña: " + contenido + " (Autor: " + autor + ", Fecha: " + fecha + ")";
    }

    @Override
    public void calificar(int puntuacion) {
        if (puntuacion >= 1 && puntuacion <= 5) {
            calificaciones.add(puntuacion);
            System.out.println("Calificación añadida: " + puntuacion);
        } else {
            System.out.println("La puntuación debe estar entre 1 y 5.");
        }
    }

    @Override
    public double obtenerPromedioCalificacion() {
        return calificaciones.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public void asignarCategoria(String categoria) {
        this.categoria = categoria;
        System.out.println("Categoría asignada: " + categoria);
    }

    @Override
    public String obtenerCategoria() {
        return categoria;
    }
}

