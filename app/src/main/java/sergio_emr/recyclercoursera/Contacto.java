package sergio_emr.recyclercoursera;

/**
 * Created by sergio on 25/06/2016.
 */
public class Contacto {

    private String nombre;
    private String telefono;
    private int foto;

    public Contacto(String nombre, String telefono, int foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
