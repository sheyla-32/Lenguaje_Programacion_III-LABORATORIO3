public abstract class AbstractWeapon implements Weapon {
    private final String type;
    private final int baseDamage;
    private final ElementalEffect efecto;      // Inyección de dependencia (DIP)
    private final double probabilidadCritico;  // 0.0 a 1.0
 
    public AbstractWeapon(String type, int baseDamage, ElementalEffect efecto, double probCritico) {
        this.type = type;
        this.baseDamage = baseDamage;
        this.efecto = efecto;
        this.probabilidadCritico = probCritico;
    }
 
    @Override public String getType() { return type; }
    @Override public int getBaseDamage() { return baseDamage; }
 
    protected int calcularDanioFinal(int danioSinBonus) {
        int danio = efecto.aplicar(danioSinBonus);
        if (Math.random() < probabilidadCritico) {
            danio = (int) (danio * 1.5); // golpe crítico
        }
        return danio;
    }
}
