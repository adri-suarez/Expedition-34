package src;

public class Guerrero extends Personaje {
    public static final int TIPO = 1;
    private int escudo;

    public Guerrero(String nombre, int vida, int poder, boolean esEnemigo) {
        super(nombre, vida, poder, TIPO, esEnemigo);
        this.escudo = 100; //podria venir por parametro (no se como esta el main)
    }

    @Override 
    public int atacar() { 
        return getPoder(); 
    } 

    @Override 
    public void defender() {
        if (escudo >= 20) { escudo -= 20; setDefensa(); } 
    } //defensa consume 20 de escudo
    
    @Override 
    public int usarHabilidadEspecial() {
        return getPoder()*2; 
    } //doble daño
}
