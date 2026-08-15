/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import model.pedidoComida;
import model.pedidoEncomienda;
import model.pedidoExpress;

/**
 *
 * @author Francisco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pedidoComida comida = new pedidoComida(5, "Eduardo Frei 89", "Comida");
        pedidoEncomienda encomienda = new pedidoEncomienda(12, "Las camelias 32", "Encomienda");
        pedidoExpress express = new pedidoExpress(22, "Colo Colo 794", "Express");
        
        System.out.println("=== SpeedFast 1.0 ===");
        
        System.out.println("\n[Pedido Comida]");
        comida.asignarRepartidor();
        comida.asignarRepartidor("Juan Soto");
        
        System.out.println("\n[Pedido Encomienda]");
        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Carlos Pinto");
        
        System.out.println("\n[Pedido Express]");
        express.asignarRepartidor();
        express.asignarRepartidor("Cristian Campos");

    }
    
}
