
package examen2p2_carlosflores;


public class Cancion {
    
    private String titulo;
    private double tiempo;
    private Album albumPert = new Album();
    private Single singPert = new Single();

    public Cancion(String titulo, double tiempo) {
        this.titulo = titulo;
        this.tiempo = tiempo;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public Album getAlbumPert() {
        return albumPert;
    }

    public void setAlbumPert(Album albumPert) {
        this.albumPert = albumPert;
    }

    public Single getSingPert() {
        return singPert;
    }

    public void setSingPert(Single singPert) {
        this.singPert = singPert;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", tiempo=" + tiempo + ", albumPert=" + albumPert + ", singPert=" + singPert + '}';
    }
    
    
}
