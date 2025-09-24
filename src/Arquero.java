package src;

public class Arquero extends Personaje {
    public static final int TIPO = 0;
    private int flechas;

    public Arquero(String nombre, int vida, int poder, int flechas, boolean esEnemigo) {
        super(nombre, vida, poder, TIPO, esEnemigo);
        this.flechas = flechas;
    }

    // *** Constructor que espera el Main.class (4 parámetros) ***
    public Arquero(String nombre, int vida, int poder, boolean esEnemigo) {
        this(nombre, vida, poder, 10, esEnemigo); // flechas por defecto
    }

    @Override public int atacar() { if (flechas <= 0) return 0; flechas--; return getPoder(); }
    @Override public void defender() { setDefensa(); }
    @Override public int usarHabilidadEspecial() { if (flechas < 2) return 0; flechas -= 2; return getPoder()*4; }
}