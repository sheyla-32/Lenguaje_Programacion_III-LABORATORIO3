import java.util.ArrayList;
import java.util.List;
 
public class TestNotificacion {
    public static void main(String[] args) {
        List<EnviadorMensaje> canales = new ArrayList<>();
        canales.add(new EmailSender());
        canales.add(new SMSSender());
 
        NotificationManager manager = new NotificationManager(canales);
        manager.notificar("Su reserva ha sido confirmada");
    }
}
