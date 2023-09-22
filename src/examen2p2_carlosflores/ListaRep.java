
package examen2p2_carlosflores;

import java.util.ArrayList;


class ListaRep {
    private String nombreUs;
    private int likes;
    private ArrayList<Cancion> cancionesAdd = new ArrayList<>();

    public ListaRep(String nombreUs, int likes) {
        this.nombreUs = nombreUs;
        this.likes = likes;
    }

    public ListaRep() {
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCancionesAdd() {
        return cancionesAdd;
    }

    public void setCancionesAdd(ArrayList<Cancion> cancionesAdd) {
        this.cancionesAdd = cancionesAdd;
    }

    @Override
    public String toString() {
        return "ListaRep{" + "nombreUs=" + nombreUs + ", likes=" + likes + ", cancionesAdd=" + cancionesAdd + '}';
    }
    
    
}
