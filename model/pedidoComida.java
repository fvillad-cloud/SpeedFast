/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Esta clase representa un pedido de comida y  hereda de la super-clase Pedido, por lo
 * que hereda los atributos y el metodo "asignarRepartidor()"
 * 
 * @author Francisco
 */
public class pedidoComida extends Pedido {

    public pedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    
    //Sobreescritura del método heredado asignarRepartidor()
    @Override
    public void asignarRepartidor(){
        System.out.println("Verificando mochila termica... OK");
        
    }
    
    /**Sobrecarga del método asignarRepartidor. Se asigna el parametro tipo String "nombreRepartidor", para diferenciarlo
     * del metodo heredado asignarRepartidor()
     * @param nombreRepartidor
    **/
    
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Pedido asignado a "+nombreRepartidor);
    }
}
