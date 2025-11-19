
package datos;

/**
 *
 * @author zamorraf
 */
public class Direccion {
    private String pais;
    private String provincia;
    private String canton;
    private String distrito;
    private String otrasSenas;

    public Direccion(String pais, String provincia, String canton, String distrito) {
        this.pais = pais;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
    }

    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}

    public String getProvincia() {return provincia;}
    public void setProvincia(String provincia) {this.provincia = provincia;}

    public String getCanton() { return canton; }
    public void setCanton(String canton) { this.canton = canton; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getOtrasSenas() { return otrasSenas; }
    public void setOtrasSenas(String otrasSenas) { this.otrasSenas = otrasSenas;}
    
}
