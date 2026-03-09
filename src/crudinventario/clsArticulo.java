/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

import javax.swing.ListModel;

/**
 *
 * @author shdez
 */
public class clsArticulo {
    
    //atributos que necesito que tenga mi objeto articulo
    private final String codigo;
    private final String descripción;
    private final  Double precio;
    private String descripcion;
    
    //Constructor
    public clsArticulo(String codigo, String descripcion, Double precio){
        this.codigo = codigo;
        this.descripción = descripcion;
        this.precio = precio;
    }

    clsArticulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ListModel<String> llenarLista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void actualizar(String newCodigo, String newDescripcion, String newPrecio){
        // Generamos la nueva linea de registro
        String nuevaLinea = newCodigo + "!" + newDescripcion + "!" + newPrecio;
        String lineaOriginal = this.codigo + "!" + this.descripcion + "!" + this.precio;
        //Imprimir los nuevos valores
        System.out.println("Nuevo valores:" + nuevaLinea);
        System.out.println("Valores Orginales:" + lineaOriginal);
        // Solicita la actualización del registro
        mArticulo mArticle = new mArticulo();
        mArticle.update(lineaOriginal, nuevaLinea, "listado_articulos.txt");
    }

    void guardar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void actualizar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class mArticulo {

        public mArticulo() {
        }

        private void update(String lineaOriginal, String nuevaLinea, String listado_articulostxt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
