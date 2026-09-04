public class Axe extendes AbstractWeapon{
    public Axe(int baseDamage) {super("hacha", baseDamage);}
    @Override
    public int calculateDamage (int level) {return getBaseDamage()+(level*4);}
}