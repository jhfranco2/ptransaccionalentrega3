/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.sockets.chat;

import java.util.Scanner;

/**
 *
 * @author ing.mateo
 */
public class main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese la entidad");
        String entidad = entrada.nextLine();
        System.out.println("Ingrese el dato");
        String dato = entrada.nextLine();
        
        String mensaje = tipo +"/" + entidad + "/" + dato;  
        Cliente cliente = new Cliente(5000,mensaje);
        Thread hilo = new Thread(cliente);
        hilo.start();
    }
}
