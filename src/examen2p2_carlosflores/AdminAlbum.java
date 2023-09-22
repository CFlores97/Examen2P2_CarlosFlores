
package examen2p2_carlosflores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AdminAlbum {
    private ArrayList<Album> listaAlbumes = new ArrayList();
    private File archivo = null;
    
    public AdminAlbum(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<Album> getListaAlbumes() {
        return listaAlbumes;
    }
    
    public void setListaAlbumes(ArrayList<Album> listaPersonas) {
        this.listaAlbumes = listaPersonas;
    }
    
    @Override
    public String toString() {
        return "listaPersonas=" + listaAlbumes;
    }

    //extra mutador
    public void setAlbum(Album p) {
        this.listaAlbumes.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Album t : listaAlbumes) {
                bw.write(t.getTitPub()+ ";");
                bw.write(t.getFechaLanz()+ ";");
                bw.write(t.getLikes()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        ArrayList listaAlbumes = new ArrayList();
        
        if (archivo.exists()) {
            
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                
                while (sc.hasNext()) {
                    listaAlbumes.add(new Album(sc.next(), sc.next(), sc.nextInt()));
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "null");
            }
            sc.close();
        }//FIN IF
    }
}
