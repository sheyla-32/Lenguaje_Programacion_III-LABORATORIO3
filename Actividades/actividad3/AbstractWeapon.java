public abstract class AbstractWeapon implements Weapon {
    private final String type;
    private final int baseDamage;
 
    public AbstractWeapon(String type, int baseDamage) {
        this.type = type;
        this.baseDamage = baseDamage;
    }
 
    @Override public String getType() { return type; }
    @Override public int getBaseDamage() { return baseDamage; }
}
