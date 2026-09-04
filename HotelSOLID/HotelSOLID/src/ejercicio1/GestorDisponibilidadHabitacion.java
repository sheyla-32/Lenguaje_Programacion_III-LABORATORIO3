package ejercicio1;

public class GestorDisponibilidadHabitacion {

    private boolean disponible;

    public GestorDisponibilidadHabitacion() {
        disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        if (disponible) {
            disponible = false;
            System.out.println("Habitación reservada correctamente.");
        } else {
            System.out.println("La habitación ya está reservada.");
        }
    }

    public void liberar() {
        disponible = true;
        System.out.println("Habitación liberada correctamente.");
    }
}