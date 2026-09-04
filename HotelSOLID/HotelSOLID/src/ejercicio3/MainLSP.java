package ejercicio3;

public class MainLSP {

    public static void main(String[] args) {

        Habitacion[] habitaciones = {
            new HabitacionIndividual(101, 100),
            new HabitacionDoble(201, 180),
            new Suite(301, 350)
        };

        int noches = 3;

        for (Habitacion habitacion : habitaciones) {

            habitacion.mostrarDatos();

            System.out.println(
                "Precio por " + noches + " noches: S/ "
                + habitacion.calcularPrecio(noches)
            );

            System.out.println();
        }
    }
}