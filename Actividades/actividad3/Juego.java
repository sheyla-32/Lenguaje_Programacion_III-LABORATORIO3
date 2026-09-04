public class Juego{
    public static void main(String[] args) {
       Weapon sword = new Sword(50) ;
       Weapon bow = new Bow(30);
       Weapon axe = new Axe(40);

       DamageCalculator calculator = new DamageCalculator();
       System.out.println("DAÑO ESPADA:"+calculator.calculateDamage(sword, 10));
       System.out.println("DAÑO ARCO"+calculator.calculateDamage(bow, 10));
       System.out.println("DAÑI HACHA"+calculator.calculateDamage(axe, 10));
    }
}
