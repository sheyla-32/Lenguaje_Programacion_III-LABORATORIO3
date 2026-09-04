public class EfectoHielo implements ElementalEffect {
    @Override public int aplicar(int danioBase) { return danioBase + (int) (danioBase * 0.15); }
    @Override public String getNombreElemento() { return "Hielo"; }
}
