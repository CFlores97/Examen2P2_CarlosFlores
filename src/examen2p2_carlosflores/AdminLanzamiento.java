
package examen2p2_carlosflores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AdminLanzamiento {
    private ArrayList<Lanzamiento> listaLanzamientos = new ArrayList();
    private File archivo = null;
    
    public AdminLanzamiento(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<Lanzamiento> getListaPersonas() {
        return listaLanzamientos;
    }
    
    public void setListaPersonas(ArrayList<Lanzamiento> listaPersonas) {
        this.listaLanzamientos = listaPersonas;
    }
    
    @Override
    public String toString() {
        return "listaPersonas=" + listaLanzamientos;
    }

    //extra mutador
    public void setPersona(Lanzamiento p) {
        this.listaLanzamientos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Lanzamiento t : listaLanzamientos) {
                /*w.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getedad() + ";");*/
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        
        if (archivo.exists()) {
            
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                
                while (sc.hasNext()) {
                    listaPersonas.add(new Persona(sc.nextInt(), sc.next(), sc.nextInt()));
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "null");
            }
            sc.close();
        }//FIN IF
    }
}
