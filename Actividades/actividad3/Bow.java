public class Bow extends AbstractWeapon{
    public Bow(int baseDamage) {super("arco", baseDamage)}
    @Override
    public int calculateDamage(int level) {return getBaseDamage()+(level*5);}
}