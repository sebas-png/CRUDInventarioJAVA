/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

/**
 *
 * @author shdez
 */
public class clsArticulo {
    
    //atributos que necesito que tenga mi objeto articulo
    private final String codigo;
    private final String descripción;
    private final Double precio;
    
    //Constructor
    public clsArticulo(String codigo, String descripcion, Double precio){
        this.codigo = codigo;
        this.descripción = descripcion;
        this.precio = precio;
    }
    
    //Imprimir en consola los datos del articulo
    public String aTexto(){
        String articulo = this.codigo + "!" + this.descripción + "!" + this.precio;
        return articulo;
        
    }
    //guardar informacion
    public void guardar(){
        System.out.println(this.aTexto());
    }
}
