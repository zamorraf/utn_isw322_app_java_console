
package persistencia;

import datos.Cliente;

/**
 *
 * @author zamorraf
 */
public class InicializarDatos {
    private ClienteDAO clienteDAO = new ClienteDAO();
    
    public void CargarDatosIniciales(){
        
        if (clienteDAO.listarClientes().isEmpty()) {
            clienteDAO.agregarCliente(new Cliente("205370796","Rafael","Zamora","Arce","Costarricense"));
            
            
            clienteDAO.agregarCliente(new Cliente("109990999","Elon","Musk","Musk","Estadounidense"));
        }
    }
}
