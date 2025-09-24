package src;

public class Mago extends Personaje {
    public static final int TIPO = 2;
    private int mana;

    public Mago(String nombre, int vida, int poder, boolean esEnemigo) {
        super(nombre, vida, poder, TIPO, esEnemigo);
        this.mana = 100; //podria venir por parametro (no se como esta el main)
    }

    @Override 
    public int atacar() {
        if (mana < 25) return 0; mana -= 25; return getPoder(); 
    } //consume 25

    @Override 
    public void defender() { 
        mana += 20; setDefensa(); 
    } //recupera 20
    
    @Override 
    public int usarHabilidadEspecial() { 
        if (mana < 75) return 0;
        mana -= 75; setVida(getVida()+50);
        return 50; 
    } //consume 75 y cura 50
}