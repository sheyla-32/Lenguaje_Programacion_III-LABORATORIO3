package ejercicio4;

public class Suite implements ServicioLimpieza,
        ServicioComida, ServicioLavanderia {

    private int numero;

    public Suite(int numero) {
        this.numero = numero;
    }

    @Override
    public void solicitarLimpieza() {
        System.out.println(
                "Limpieza solicitada para la suite "
                + numero
        );
    }

    @Override
    public void solicitarComida() {
        System.out.println(
                "Servicio de comida solicitado para la suite "
                + numero
        );
    }

    @Override
    public void solicitarLavanderia() {
        System.out.println(
                "Servicio de lavandería solicitado para la suite "
                + numero
        );
    }
}