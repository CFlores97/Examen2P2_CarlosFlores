package examen2p2_carlosflores;

public class Usuario {

    private String username, password;
    private int edad; //(Nota, el usuario debe ser mayor de 12 años para poder ser un
                        //oyente y mayor de 18 para ser artista).

    public Usuario(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public Usuario() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return username;
    }

}
