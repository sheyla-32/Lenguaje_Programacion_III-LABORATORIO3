package ejercicio2;

public class Reserva {

    private String codigo;
    private double precio;
    private int horasAntesCheckIn;
    private PoliticaCancelacion politicaCancelacion;

    public Reserva(String codigo, double precio,
                   int horasAntesCheckIn,
                   PoliticaCancelacion politicaCancelacion) {

        this.codigo = codigo;
        this.precio = precio;
        this.horasAntesCheckIn = horasAntesCheckIn;
        this.politicaCancelacion = politicaCancelacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getHorasAntesCheckIn() {
        return horasAntesCheckIn;
    }

    public void cancelar() {

        if (politicaCancelacion.puedeCancelar(this)) {

            double penalizacion =
                    politicaCancelacion.calcularPenalizacion(this);

            System.out.println("Reserva " + codigo + " cancelada.");
            System.out.println("Penalización: S/ " + penalizacion);

        } else {
            System.out.println("La reserva " + codigo
                    + " no puede ser cancelada.");
        }
    }
}
