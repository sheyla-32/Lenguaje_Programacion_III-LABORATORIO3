package ejercicio3;

public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(int numero, double precioPorNoche) {
        super(numero, precioPorNoche);
    }

    @Override
    public double calcularPrecio(int noches) {
        return precioPorNoche * noches;
    }
}