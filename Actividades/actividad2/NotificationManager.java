import java.util.List;

public class NotificationManager {
    private List<EnviadorMensaje> canales;
 
    public NotificationManager(List<EnviadorMensaje> canales) {
        this.canales = canales;
    }
 
    public void notificar(String message) {
        for (EnviadorMensaje canal : canales) {
            canal.enviar(message);
        }
    }
}
