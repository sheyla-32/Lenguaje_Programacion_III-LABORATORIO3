public class JuegoRPG {
    public static void main(String[] args) {
        Weapon espadaFuego = new Sword(50, new EfectoFuego(), 0.2);
        Weapon arcoHielo = new Bow(30, new EfectoHielo(), 0.1);
 
        Jugador heroe = new Jugador("Arthas", 120, 10, espadaFuego);
        Enemigo orco = new Enemigo("Orco Cazador", 100, 8, arcoHielo);
 
        new Combate().iniciar(heroe, orco);
    }
}
