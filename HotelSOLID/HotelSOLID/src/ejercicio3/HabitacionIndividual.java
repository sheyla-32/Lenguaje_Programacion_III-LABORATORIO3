package ejercicio3;

public class HabitacionIndividual extends Habitacion {

    public HabitacionIndividual(int numero, double precioPorNoche) {
        super(numero, precioPorNoche);
    }

    @Override
    public double calcularPrecio(int noches) {
        return precioPorNoche * noches;
    }
}