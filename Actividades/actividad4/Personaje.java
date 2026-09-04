public abstract class Personaje {
    protected String nombre;
    protected int salud;
    protected int nivel;
    protected Weapon arma; // depende de la abstracción Weapon, no de una clase concreta
 
    public Personaje(String nombre, int salud, int nivel, Weapon arma) {
        this.nombre = nombre; this.salud = salud; this.nivel = nivel; this.arma = arma;
    }
 
    public void atacar(Personaje objetivo) {
        int danio = arma.calculateDamage(nivel);
        System.out.println(nombre + " ataca a " + objetivo.nombre + " causando " + danio + " de daño.");
        objetivo.recibirDanio(danio);
    }
 
    public void recibirDanio(int danio) {
        salud -= danio;
        if (salud < 0) salud = 0;
    }
 
    public boolean estaVivo() { return salud > 0; }
    public String getNombre() { return nombre; }
}
