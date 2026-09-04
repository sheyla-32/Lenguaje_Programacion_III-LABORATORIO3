package ejercicio3;

public abstract class Habitacion {

    protected int numero;
    protected double precioPorNoche;

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;
    }

    public abstract double calcularPrecio(int noches);

    public void mostrarDatos() {
        System.out.println("Habitación N.° " + numero);
    }
}