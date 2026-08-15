/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase padre que representa un pedido estandar dentro del sistema SpeedFast.
 * 
 * Las clases "pedidoComida", "pedidoEncomienda" y "pedidoExpress" heredan de ella
 * usando la palabra clave "extends". Gracias a la herencia, esas clases
 * reutilizan el metodo "asignarRepartidor()"
 * 
 * @author Francisco
 */
public class Pedido {
    /**
     * atributos varios
     */
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }
    
    
    //metodo que será sobrescrito por las subclases que heredan de Pedido.
    public void asignarRepartidor(){
        System.out.println("Asigna repartidor");
    }
}
