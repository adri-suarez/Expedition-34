package src;

import javax.swing.ImageIcon;

public abstract class Personaje {
    //Completar Tipos y Modificadores!!
    nombre;
    vida;
    private poder;
    private final int tipo;
    private boolean defendiendo;
    esEnemigo;
    
    //Ignorar
    private final ImageIcon baseImagen;

    public Personaje(String nombre, int vida, int poder, int tipo, boolean esEnemigo) {
        // Completar todo lo necesario!!
        this.nombre = nombre;
        this.vida = ;
        this.defendiendo = false;

        // No modificar (se encarga de asignar imágenes automáticamente)
        if (!esEnemigo) {
            baseImagen = switch (tipo) {
                case 1 -> new ImageIcon("images/Guerrero.png");
                case 2 -> new ImageIcon("images/Mago.png");
                default -> new ImageIcon("images/Arquero.png");
            };
        } else {
            baseImagen = switch (tipo) {
                case 1 -> new ImageIcon("images/Guerrero-enemigo.png");
                case 2 -> new ImageIcon("images/Mago-enemigo.png");
                default -> new ImageIcon("images/Arquero-enemigo.png");
            };
        }
    }

    // Métodos a completar!!
    public String getNombre() { 
        return this.nombre;     // ejemplo
    }
    public int getVida() { ... }
    public void setVida(int vida) { ... }
    public int getPoder() { ... }
    public void setDefensa() { ... }
    public boolean estaVivo() { ... }
    public void recibirDanio(int danio) { ... }

    // Métodos abstractos (deben implementarse en subclases)
    public abstract int atacar();
    public abstract void defender();
    public abstract int usarHabilidadEspecial();




    // Ignorar (no modificar)
    public ImageIcon getImagen() {
        return baseImagen;
    }
}
