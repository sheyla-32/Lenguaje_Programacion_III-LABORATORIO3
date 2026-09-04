package ejercicio6;

public class HabitacionEstandar extends Habitacion
        implements ServicioLimpieza {

    public HabitacionEstandar(int numero, double precioPorNoche) {
        super(numero, precioPorNoche);
    }

    @Override
    public String getTipo() {
        return "Estándar";
    }

    @Override
    public void solicitarLimpieza() {
        System.out.println(
                "Limpieza solicitada para la habitación " + numero
        );
    }
}