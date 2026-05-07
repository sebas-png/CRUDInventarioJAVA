/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shdez
 */
public class clsCSV {
    // Atributo de el objeto csv2
    String archivo = "inventario.csv";
    
    double totalGeneral = 0;
    // Metodo de el objeto csv2
    public void importarDatos(){
    try(BufferedReader br = new BufferedReader( new FileReader(archivo))){
            br.readLine(); //Salta primera linea
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                // Asignscion de valores para insertar datos.
                clsArticulo cArticulo = new clsArticulo(datos[0], datos[1], Double.parseDouble(datos[2]));
                // Almacena en archivo txt
                cArticulo.guardar();
            }
            br.close();   
            
            System.out.println("Se ha terminado con la importación:" );
        }catch(IOException e){
            System.out.println("Mensaje de error" + e.getMessage());
            System.out.println("Error al cargar los datos");
        }
}
    
       
}
public void importarClientes(){    
    String archivo2 = null;
        try(BufferedReader br = new BufferedReader(new FileReader(archivo2))){        
            br.readLine();   
            String linea;         
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                // Asignacion de valores para insertar.datos
                clsClientes cCliente = new clsClientes(Integer.parseInt(datos[0]), datos[1],
                        datos[2], datos[3]);
                // Almacena en archivo txt
                cCliente.guardar();
                }
            br.close();
            System.out.println("Se ha terminado la importacion.");    
        }catch(IOException e){
            System.out.println("Mensaje de error" + e.getMessage());
        }
    }
