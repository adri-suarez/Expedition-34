package src;

public class Arquero extends Personaje {
    public static final int TIPO = 0;
    private int flechas;

    public Arquero(String nombre, int vida, int poder, boolean esEnemigo) {
        super(nombre, vida, poder, TIPO, esEnemigo);
        this.flechas = 10; //podria venir por parametro (no se como esta el main)
    }

    @Override 
    public int atacar() {
        if (flechas <= 0) return 0; flechas--; return getPoder(); 
    } //ataque normal consume 1 flecha
    
    @Override 
    public void defender() {
        setDefensa(); 
    }
    
    @Override 
    public int usarHabilidadEspecial() {
        if (flechas < 2) return 0; flechas -= 2; return getPoder()*4; 
    }//ataque especial consume 2 flechas
}