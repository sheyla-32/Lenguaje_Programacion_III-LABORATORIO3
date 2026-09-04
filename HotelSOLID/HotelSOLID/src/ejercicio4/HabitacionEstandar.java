package ejercicio4;

public class HabitacionEstandar implements ServicioLimpieza {

    private int numero;

    public HabitacionEstandar(int numero) {
        this.numero = numero;
    }

    @Override
    public void solicitarLimpieza() {
        System.out.println(
                "Limpieza solicitada para la habitación estándar "
                + numero
        );
    }
}