
package examen2p2_carlosflores;

import java.io.Serializable;
import java.util.ArrayList;


public class Cliente extends Usuario implements Serializable{
    
    private ArrayList<Cancion> cancionesfav = new ArrayList<>();
    private ArrayList<ListaRep> listasRepCre = new ArrayList<>();
    private ArrayList<ListaRep> listasRepFav = new ArrayList<>();

    public Cliente(String username, String password, int edad) {
        super(username, password, edad);
    }

    public Cliente() {
        super();
    }

    public ArrayList<Cancion> getCancionesfav() {
        return cancionesfav;
    }

    public void setCancionesfav(ArrayList<Cancion> cancionesfav) {
        this.cancionesfav = cancionesfav;
    }

    public ArrayList<ListaRep> getListasRepCre() {
        return listasRepCre;
    }

    public void setListasRepCre(ArrayList<ListaRep> listasRepCre) {
        this.listasRepCre = listasRepCre;
    }

    public ArrayList<ListaRep> getListasRepFav() {
        return listasRepFav;
    }

    public void setListasRepFav(ArrayList<ListaRep> listasRepFav) {
        this.listasRepFav = listasRepFav;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cancionesfav=" + cancionesfav + ", listasRepCre=" + listasRepCre + ", listasRepFav=" + listasRepFav + '}';
    }
    
    
    
    
    
    
}
