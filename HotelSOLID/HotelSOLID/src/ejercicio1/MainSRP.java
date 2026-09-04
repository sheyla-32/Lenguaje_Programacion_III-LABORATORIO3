package ejercicio1;

public class MainSRP {

    public static void main(String[] args) {

        Habitacion habitacion = new Habitacion(101, "Individual", 120.0);

        System.out.println("Habitación: " + habitacion.getNumero());
        System.out.println("Tipo: " + habitacion.getTipo());
        System.out.println("Precio: S/ " + habitacion.getPrecio());

        System.out.println("Disponible: " + habitacion.estaDisponible());

        habitacion.reservar();

        System.out.println("Disponible después de reservar: "
                + habitacion.estaDisponible());

        habitacion.liberar();

        System.out.println("Disponible después de liberar: "
                + habitacion.estaDisponible());
    }
}