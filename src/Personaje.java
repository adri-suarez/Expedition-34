package src;

import javax.swing.ImageIcon;

public abstract class Personaje {
    //Completar Tipos y Modificadores!!
    private String nombre;
    private int vida;
    private int poder;
    private final int tipo;
    private boolean defendiendo;
    private boolean esEnemigo;
    
    //Ignorar
    private final ImageIcon baseImagen;

    public Personaje(String nombre, int vida, int poder, int tipo, boolean esEnemigo) {
        // Completar todo lo necesario!!
        this.nombre = nombre;
        this.vida = vida;
        this.poder = poder;
        this.tipo = tipo;
        this.esEnemigo = esEnemigo;
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
    public int getVida() { 
        return this.vida;
     }
    public void setVida(int vida) { 
        Math.max(0, vida);
     }
    public int getPoder() { 
        return this.poder;
     }
    public void setDefensa() { 
        this.defendiendo = true;
     }
    public boolean estaVivo() { 
        return this.vida > 0; 
     }
    public void recibirDanio(int danio) { 
        if (!estaVivo()) return; //si no esta vivo no recibe daño
        int danioAux = Math.max(0, danio); //auxiliar
        if (this.defendiendo) danioAux = danioAux / 4; //si defiende reduce a 1/4 el daño (podria usar op ternario)
        this.vida = Math.max(0, this.vida - danioAux); //reduce la vida
        this.defendiendo = false; // Desactiva defensa después de recibir daño
     }

    // Métodos abstractos (deben implementarse en subclases)
    public abstract int atacar();
    public abstract void defender();
    public abstract int usarHabilidadEspecial();




    // Ignorar (no modificar)
    public ImageIcon getImagen() {
        return baseImagen;
    }
}