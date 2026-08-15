/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Esta clase representa un pedido de entrega rápida y hereda de la super-clase Pedido, por lo
 * que hereda los atributos y el metodo "asignarRepartidor()"
 * @author Francisco
 */
public class pedidoExpress extends Pedido{

    public pedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    //Sobreescritura del metodo asignarRepartidor() heredado de Pedido
    @Override
    public void asignarRepartidor(){
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado.");
    }
    //metodo sobrecargado.
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Pedido asignado a "+nombreRepartidor);
    }
    
}
