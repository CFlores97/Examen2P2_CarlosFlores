
package examen2p2_carlosflores;

import java.io.Serializable;
import java.util.Date;


public class Lanzamiento implements Serializable{
    private String titPub;
    private String fechaLanz;
    private int likes;

    public Lanzamiento(String titPub, String fechaLanz, int likes) {
        this.titPub = titPub;
        this.fechaLanz = fechaLanz;
        this.likes = likes;
    }

    public Lanzamiento() {
    }

    public String getTitPub() {
        return titPub;
    }

    public void setTitPub(String titPub) {
        this.titPub = titPub;
    }

    public String getFechaLanz() {
        return fechaLanz;
    }

    public void setFechaLanz(String fechaLanz) {
        this.fechaLanz = fechaLanz;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "titPub=" + titPub + ", fechaLanz=" + fechaLanz + ", likes=" + likes + '}';
    }
    
    
}
