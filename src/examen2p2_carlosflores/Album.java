
package examen2p2_carlosflores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


class Album extends Lanzamiento implements Serializable{
    private ArrayList<Cancion> cancionesPert = new ArrayList<>();
    private ArrayList<Cancion> cancionesActual = new ArrayList<>();

    public Album(String titPub, String fechaLanz, int likes) {
        super(titPub, fechaLanz, likes);
    }

    public Album() {
        super();
    }

    public ArrayList<Cancion> getCancionesPert() {
        return cancionesPert;
    }

    public void setCancionesPert(ArrayList<Cancion> cancionesPert) {
        this.cancionesPert = cancionesPert;
    }

    public ArrayList<Cancion> getCancionesActual() {
        return cancionesActual;
    }

    public void setCancionesActual(ArrayList<Cancion> cancionesActual) {
        this.cancionesActual = cancionesActual;
    }

    @Override
    public String toString() {
        return "Album{" + "cancionesPert=" + cancionesPert + ", cancionesActual=" + cancionesActual + '}';
    }
    
    
    
    
    
}
