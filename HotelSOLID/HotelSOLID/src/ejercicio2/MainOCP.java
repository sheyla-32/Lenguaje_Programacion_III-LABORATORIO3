package ejercicio2;

public class MainOCP {

    public static void main(String[] args) {

        Reserva reserva1 = new Reserva(
                "R001",
                500,
                48,
                new PoliticaCancelacionFlexible()
        );

        Reserva reserva2 = new Reserva(
                "R002",
                600,
                80,
                new PoliticaCancelacionModerada()
        );

        Reserva reserva3 = new Reserva(
                "R003",
                700,
                100,
                new PoliticaCancelacionEstricta()
        );

        System.out.println("POLÍTICA FLEXIBLE");
        reserva1.cancelar();

        System.out.println("\nPOLÍTICA MODERADA");
        reserva2.cancelar();

        System.out.println("\nPOLÍTICA ESTRICTA");
        reserva3.cancelar();
    }
}