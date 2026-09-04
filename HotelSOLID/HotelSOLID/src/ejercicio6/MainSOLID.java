package ejercicio6;
public class MainSOLID {
    public static void main(String[] args) {
        System.out.println(
                "=== SISTEMA DE RESERVAS DE HOTEL ==="
        );
        Habitacion[] habitaciones = {
            new HabitacionEstandar(101, 150),
            new Suite(301, 350)
        };
        Promocion promocion =
                new PromocionClienteFrecuente();
        CalculadoraPrecioHabitacion calculadora =
                new CalculadoraPrecioHabitacion();
        for (Habitacion habitacion : habitaciones) {

            double precio = calculadora.calcularPrecio(
                    habitacion,
                    3,
                    promocion
            );

            System.out.println();
            System.out.println(
                    "Habitación: " + habitacion.getTipo()
            );

            System.out.println(
                    "Número: " + habitacion.getNumero()
            );

            System.out.println(
                    "Precio por 3 noches con promoción: S/ "
                            + precio
            );
        }
        HabitacionEstandar estandar =
                new HabitacionEstandar(101, 150);
        Suite suite =
                new Suite(301, 350);
        System.out.println("\nSERVICIOS");
        estandar.solicitarLimpieza();
        suite.solicitarLimpieza();
        suite.solicitarComida();
        CanalNotificacion correo =
                new EnviadorCorreo();
        NotificadorReserva notificador =
                new NotificadorReserva(correo);
        System.out.println("\nNOTIFICACIÓN");

        notificador.notificar(
                "La reserva R001 fue confirmada correctamente."
        );
    }
}