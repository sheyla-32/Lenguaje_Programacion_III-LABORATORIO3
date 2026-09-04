public class Combate {
    public void iniciar(Jugador jugador, Enemigo enemigo) {
        int turno = 1;
        while (jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println("--- Turno " + turno + " ---");
            jugador.atacar(enemigo);
            if (enemigo.estaVivo()) enemigo.atacar(jugador);
            turno++;
        }
        String ganador = jugador.estaVivo() ? jugador.getNombre() : enemigo.getNombre();
        System.out.println("Ganador del combate: " + ganador);
    }
}
