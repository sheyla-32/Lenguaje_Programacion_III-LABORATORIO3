package ejercicio1;

public class Habitacion {

    private int numero;
    private String tipo;
    private double precio;
    private GestorDisponibilidadHabitacion gestorDisponibilidad;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.gestorDisponibilidad = new GestorDisponibilidadHabitacion();
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean estaDisponible() {
        return gestorDisponibilidad.estaDisponible();
    }

    public void reservar() {
        gestorDisponibilidad.reservar();
    }

    public void liberar() {
        gestorDisponibilidad.liberar();
    }
}