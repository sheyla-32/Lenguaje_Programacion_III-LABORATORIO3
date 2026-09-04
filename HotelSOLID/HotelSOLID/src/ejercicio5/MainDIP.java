package ejercicio5;

public class MainDIP {

    public static void main(String[] args) {

        CanalNotificacion correo =
                new EnviadorCorreo();

        NotificadorReserva notificadorCorreo =
                new NotificadorReserva(correo);

        notificadorCorreo.notificar(
                "Su reserva R001 fue confirmada."
        );

        CanalNotificacion sms =
                new EnviadorSMS();

        NotificadorReserva notificadorSMS =
                new NotificadorReserva(sms);

        notificadorSMS.notificar(
                "Su habitación ya está disponible."
        );
    }
}