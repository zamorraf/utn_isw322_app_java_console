
package datos;

/**
 *
 * @author zamorraf
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nacionalidad;
    private Direccion direccion;

    public Cliente(String cedula, String nombre, String apellido1, String apellido2, String nacionalidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacionalidad = nacionalidad;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre;}

    public String getApellido1() { return apellido1; }
    public void setApellido1(String apellido1) { this.apellido1 = apellido1; }

    public String getApellido2() { return apellido2; }
    public void setApellido2(String apellido2) { this.apellido2 = apellido2;}

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public Direccion getDireccion() { return direccion;}
    public void setDireccion(Direccion direccion) { this.direccion = direccion;}
    
}
