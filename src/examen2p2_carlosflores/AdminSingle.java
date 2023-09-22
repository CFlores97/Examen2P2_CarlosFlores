
package examen2p2_carlosflores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AdminSingle {
    private ArrayList<Single> listaSingles = new ArrayList();
    private File archivo = null;
    
    public AdminSingle(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<Single> getListaAlbumes() {
        return listaSingles;
    }
    
    public void setListaAlbumes(ArrayList<Single> listaPersonas) {
        this.listaSingles = listaPersonas;
    }
    
    @Override
    public String toString() {
        return "listaPersonas=" + listaSingles;
    }

    //extra mutador
    public void setSingle(Single p) {
        this.listaSingles.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Single t : listaSingles) {
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
        ArrayList listaSingles = new ArrayList();
        
        if (archivo.exists()) {
            
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                
                while (sc.hasNext()) {
                    Single temp = new Single(sc.next(), sc.next(), sc.nextInt());
                    
                    listaSingles.add(temp);
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "null");
            }
            sc.close();
        }//FIN IF
    }
}
