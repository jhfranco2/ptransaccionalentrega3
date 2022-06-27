package com.app.sockets.chat;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class Servidor extends Observable implements Runnable {

    private int puerto = 5000;

    

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;

        try {
            //Creamos el servidor del socket
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor Inciado");
            
            //Siempre estara escuchando peticiones
            while (true) {
                //Espero que el cliente se conecte 
                socket = servidor.accept();

                System.out.println("Cliente conectado");

                //Leemos el mensaje
                entrada = new DataInputStream(socket.getInputStream());
                String mensaje = entrada.readUTF();
                
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                socket.close();
                System.out.println("Cliente Desconectado");

            }

        } catch (Exception error) {
            System.out.println(error);
        }
    }

}
