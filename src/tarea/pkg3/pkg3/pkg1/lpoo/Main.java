
package tarea.pkg3.pkg3.pkg1.lpoo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Resena resena = new Resena("001", "Juan Pérez", "Un excelente itinerario de viaje", new Date());

        resena.compartir();
        resena.calificar(5);
        resena.calificar(4);
        System.out.println("Promedio de calificaciones: " + resena.obtenerPromedioCalificacion());

        resena.asignarCategoria("Itinerario");
        System.out.println("Categoría: " + resena.obtenerCategoria());

        System.out.println(resena.mostrarInfo());
    }
}
