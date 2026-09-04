package ejercicio6;

public class PromocionClienteFrecuente implements Promocion {

    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.90;
    }
}