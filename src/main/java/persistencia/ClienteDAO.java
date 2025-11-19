
package persistencia;

import datos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zamorraf
 */
public class ClienteDAO {
    private final List<Cliente> clientes = Data.clientes;//new ArrayList<>();
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public List<Cliente> listarClientes(){
        return clientes;
    }
    
    public Cliente buscarClienteCedula(String cedula){
        for (Cliente cliente : clientes){
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }
    
}
