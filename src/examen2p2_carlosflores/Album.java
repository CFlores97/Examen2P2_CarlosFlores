
package examen2p2_carlosflores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


class Album extends Lanzamiento implements Serializable{
    private ArrayList<Cancion> canciones = new ArrayList<>();
    private ArrayList<Cancion> cancionesActual = new ArrayList<>();
    private int cantCanciones;

    public Album(String titPub, String fechaLanz, int likes) {
        super(titPub, fechaLanz, likes);
    }

    public Album() {
        super();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
    
    

    public ArrayList<Cancion> getCancionesPert() {
        return canciones;
    }

    public void setCancionesPert(ArrayList<Cancion> cancionesPert) {
        this.canciones = cancionesPert;
    }

    public ArrayList<Cancion> getCancionesActual() {
        return cancionesActual;
    }

    public void setCancionesActual(ArrayList<Cancion> cancionesActual) {
        this.cancionesActual = cancionesActual;
    }

    @Override
    public String toString() {
        return "Album{" + "cancionesPert=" + canciones + ", cancionesActual=" + cancionesActual + '}';
    }
    
    
    
    
    
}
