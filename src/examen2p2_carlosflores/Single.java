
package examen2p2_carlosflores;

import java.io.Serializable;
import java.util.Date;


public class Single extends Lanzamiento implements Serializable{
    private Cancion single = new Cancion();

    public Single(String titPub, String fechaLanz, int likes) {
        super(titPub, fechaLanz, likes);
    }

    public Single() {
        super();
    }

    public Cancion getSingle() {
        return single;
    }

    public void setSingle(Cancion single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return "Single{" + "single=" + single + '}';
    }
    
    
    
    
}
