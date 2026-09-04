public class Sword extends AbstractWeapon {
    public Sword(int baseDamage) { super("espada", baseDamage); }
    @Override
    public int calculateDamage(int level) { return getBaseDamage() + (level * 5); }
}
