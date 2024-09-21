
package proyecto_gui_q3_2024_blancaamaya;

public class Estudiante {
    private String nombre;
    private String casa;

    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public Estudiante(String nombre, String casa) {
        this.nombre = nombre;
        this.casa = casa;
    }
    
}
