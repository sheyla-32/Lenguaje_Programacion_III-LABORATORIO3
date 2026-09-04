public class SMSSender implements EnviadorMensaje {
    @Override
    public void enviar(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
