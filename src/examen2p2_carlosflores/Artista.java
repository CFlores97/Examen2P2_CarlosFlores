
package examen2p2_carlosflores;

import java.io.Serializable;
import java.util.ArrayList;


public class Artista extends Usuario implements Serializable{
    private String nombreArt;
    
    private ArrayList<Cancion> cancionesSub = new ArrayList<>();
    private ArrayList<Album> albumesPub = new ArrayList<>();

    public Artista(String nombreArt, String username, String password, int edad) {
        super(username, password, edad);
        this.nombreArt = nombreArt;
    }

    public Artista(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public Artista() {
        super();
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public ArrayList<Cancion> getCancionesSub() {
        return cancionesSub;
    }

    public void setCancionesSub(ArrayList<Cancion> cancionesSub) {
        this.cancionesSub = cancionesSub;
    }

    public ArrayList<Album> getAlbumesPub() {
        return albumesPub;
    }

    public void setAlbumesPub(ArrayList<Album> albumesPub) {
        this.albumesPub = albumesPub;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombreArt=" + nombreArt + ", cancionesSub=" + cancionesSub + ", albumesPub=" + albumesPub + '}';
    }
    
    
    
    
    
    
    
}
