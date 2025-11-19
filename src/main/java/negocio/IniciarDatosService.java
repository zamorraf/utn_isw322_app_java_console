
package negocio;

import persistencia.InicializarDatos;

/**
 *
 * @author zamorraf
 */
public class IniciarDatosService {
    private final InicializarDatos datosIniciales = new InicializarDatos();
    
    public void cargarDatosIniciales(){
        datosIniciales.CargarDatosIniciales();
    }
}
