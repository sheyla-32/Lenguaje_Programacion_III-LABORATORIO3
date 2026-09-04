package ejercicio4;

public class MainISP {

    public static void main(String[] args) {

        HabitacionEstandar estandar =
                new HabitacionEstandar(101);

        Suite suite =
                new Suite(301);

        System.out.println("HABITACIÓN ESTÁNDAR");
        estandar.solicitarLimpieza();

        System.out.println("\nSUITE");
        suite.solicitarLimpieza();
        suite.solicitarComida();
        suite.solicitarLavanderia();
    }
}