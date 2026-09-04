public class EfectoFuego implements ElementalEffect {
    @Override public int aplicar(int danioBase) { return danioBase + (int) (danioBase * 0.30); }
    @Override public String getNombreElemento() { return "Fuego"; }
}
