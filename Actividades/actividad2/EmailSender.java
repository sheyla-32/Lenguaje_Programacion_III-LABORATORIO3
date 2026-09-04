public class EmailSender implements EnviadorMensaje {
    @Override
    public void enviar(String message) {
        System.out.println("Enviando correo: " + message);
    }
}
 
