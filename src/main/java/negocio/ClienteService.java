
package negocio;

import datos.Cliente;
import java.util.List;
import persistencia.ClienteDAO;

/**
 *
 * @author zamorraf
 */
public class ClienteService {
    private final ClienteDAO clienteDAO = new ClienteDAO();
    
    public void insertarCliente(Cliente cliente){
        // Validaciones
        
        clienteDAO.agregarCliente(cliente);
    }
    
    public List<Cliente> obtenerClientes(){
        return clienteDAO.listarClientes();
    }
    
    public Cliente obtenerCliente(String cedula){
        return clienteDAO.buscarClienteCedula(cedula);
    }
}
