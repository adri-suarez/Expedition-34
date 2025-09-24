package src;

public class Guerrero extends Personaje {
    public static final int TIPO = 1;
    private int escudo;

    public Guerrero(String nombre, int vida, int poder, int escudo, boolean esEnemigo) {
        super(nombre, vida, poder, TIPO, esEnemigo);
        this.escudo = escudo;
    }

    // *** Constructor que espera el Main.class (4 parámetros) ***
    public Guerrero(String nombre, int vida, int poder, boolean esEnemigo) {
        this(nombre, vida, poder, 100, esEnemigo); // escudo por defecto
    }

    @Override public int atacar() { return getPoder(); }
    @Override public void defender() { if (escudo >= 20) { escudo -= 20; setDefensa(); } }
    @Override public int usarHabilidadEspecial() { return getPoder()*2; }
}
