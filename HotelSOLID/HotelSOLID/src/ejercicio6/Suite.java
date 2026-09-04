package ejercicio6;

public class Suite extends Habitacion
        implements ServicioLimpieza, ServicioComida {

    public Suite(int numero, double precioPorNoche) {
        super(numero, precioPorNoche);
    }

    @Override
    public String getTipo() {
        return "Suite";
    }

    @Override
    public void solicitarLimpieza() {
        System.out.println(
                "Limpieza solicitada para la suite " + numero
        );
    }

    @Override
    public void solicitarComida() {
        System.out.println(
                "Servicio de comida solicitado para la suite " + numero
        );
    }
}