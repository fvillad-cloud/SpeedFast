/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**

 * Esta clase representa un pedido de entrega de encomienda  y  hereda de la super-clase Pedido, por lo
 * que hereda los atributos y el metodo "asignarRepartidor()"
 * 
 * @author Francisco
 */
 
public class pedidoEncomienda extends Pedido{

    public pedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

 
    //Metodo sobreescrito
    @Override
    public void asignarRepartidor(){
        System.out.println("Validando peso y embalaje... OK");
    }
    
    //Metodo sobrecargado, se añade parametro tipo String "nombreRepartidor"
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Pedido asignado a "+nombreRepartidor);
    }
    
}
