package ejercicio3;

public class Suite extends Habitacion {

    public Suite(int numero, double precioPorNoche) {
        super(numero, precioPorNoche);
    }

    @Override
    public double calcularPrecio(int noches) {
        return precioPorNoche * noches;
    }
}