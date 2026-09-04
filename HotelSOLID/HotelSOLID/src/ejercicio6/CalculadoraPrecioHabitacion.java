package ejercicio6;

public class CalculadoraPrecioHabitacion {

    public double calcularPrecio(
            Habitacion habitacion,
            int noches,
            Promocion promocion) {

        double precioBase =
                habitacion.getPrecioPorNoche() * noches;

        return promocion.aplicarDescuento(precioBase);
    }
}