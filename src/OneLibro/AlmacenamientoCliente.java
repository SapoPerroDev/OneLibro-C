package OneLibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AlmacenamientoCliente {

    private final String DIRECCION_FICHERO_CLIENTE = "C:\\Users\\PEOPLE\\Desktop\\OneLibro\\src\\OneLibro\\Ficheros\\Clientes.txt";

    //Registrar clientees de las partidas jugadas
    public void almacenarClientes(Cliente cliente){
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(DIRECCION_FICHERO_CLIENTE, true));
            for (Cliente mark : clientes){
                escritor.write(mark.toString());
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo: " + e.getMessage());
        }

    }
    
    public String getDIRECCION_FICHERO_CLIENTE() {
        return this.DIRECCION_FICHERO_CLIENTE;
    }

}
