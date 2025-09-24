package src;

public class Mago extends Personaje {
    public static final int TIPO = 2;
    private int mana;

    public Mago(String nombre, int vida, int poder, int mana, boolean esEnemigo) {
        super(nombre, vida, poder, TIPO, esEnemigo);
        this.mana = mana;
    }

    // *** Constructor que espera el Main.class (4 parámetros) ***
    public Mago(String nombre, int vida, int poder, boolean esEnemigo) {
        this(nombre, vida, poder, 100, esEnemigo); // maná por defecto
    }

    @Override public int atacar() { if (mana < 25) return 0; mana -= 25; return getPoder(); }
    @Override public void defender() { mana += 20; setDefensa(); }
    @Override public int usarHabilidadEspecial() { if (mana < 75) return 0; mana -= 75; setVida(getVida()+50); return 50; }
}