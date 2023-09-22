
package examen2p2_carlosflores;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminCliente {
    private ArrayList<Cliente> listaClientes = new ArrayList();
    private File archivo = null;

    public AdminCliente(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cliente> getListaUsuarios() {
        return listaClientes;
    }

    public void setListaUsuarios(ArrayList<Cliente> listaUsuarios) {
        this.listaClientes = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(Cliente a) {
        listaClientes.add(a);
    }

    public void cargarArchivo() {
        try {
            listaClientes = new ArrayList();
            Cliente temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cliente) objeto.readObject()) != null) {
                        listaClientes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : listaClientes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
