package com.app.sockets.chat;

import java.io.DataOutputStream;
import java.net.Socket;


public class Cliente implements Runnable{
    
    //Creamos los atributos del puerto y el mesaje
    private int puerto;
    public String mensaje;
    public String tipo,entidad,datos;

    

    public Cliente(int puerto,String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

   
    
    
    @Override
    public void run() {
         
        System.out.println("este es el mensaje " + mensaje);
         //Host del servidor
         final String HOST = "127.0.0.1";
        
         //Puerto del servidor
         DataOutputStream salida;
         
         try {
             Socket socket = new Socket(HOST,puerto);
             salida = new DataOutputStream(socket.getOutputStream());
             
             //Enviemos el mensaje
             
                     
             salida.writeUTF(mensaje);
        } catch (Exception e) {
             System.out.println(e);
        } 
         
    }
    
    
}
