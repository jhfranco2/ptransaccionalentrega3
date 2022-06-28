/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.sockets.chat;

import com.app.sockets.controlador.Controlador;
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
         Controlador con = new Controlador();
        if(tipo.equals("insert")){
            System.out.println("ingrese el nombre del pais");
            String nomPais = entrada.nextLine();
            con.insertarPais(nomPais);
            
            
            System.out.println("ingrese el nombre del cargo");
            String nombreCargo = entrada.nextLine();
            System.out.println("ingrese el salario minimo");
            int salmin = entrada.nextInt();
            System.out.println("ingrese el salario maximo");
            int salmax = entrada.nextInt();
            con.insertarCargo(nombreCargo, salmin, salmax);
            
            
            System.out.println("Ingresar la ciudad");
            System.out.println("Ingrese el numero del pais");
            int numPais = entrada.nextInt();
            System.out.println("Ingrese el nombre el nombre de la ciudad");
            String nomCiudad = entrada.next();
            
            con.insertarCiudad(numPais, nomCiudad);
            
            System.out.println("Ingresar la localizacion");
            System.out.println("Ingrese el numero de la ciudad");
            int numCiudad = entrada.nextInt();
            System.out.println("Ingrese la direccion");
            String direccion = entrada.next();
            con.insertarLocalizacion(numCiudad, direccion);
            
            System.out.println("Ingresar el departamento");
            System.out.println("Ingresar el numero de la localizacion");
            int numLocaliz = entrada.nextInt();
            System.out.println("Ingrese el nombre del departamento");
            String nomDepartamento = entrada.next();
            con.insertarDepartamento(numLocaliz, nomDepartamento);
            
            System.out.println("Ingresar el empleado");
            System.out.println("Ingresar cedula");
            int cedula = entrada.nextInt();
            System.out.println("Ingresar primer nombre");
            String pNombre = entrada.next();
            System.out.println("Ingresar segundo nombre");
            String sNombre = entrada.next();
            System.out.println("Ingresar primer Apellido");
            String pApellido = entrada.next();
            System.out.println("Ingresar segundo Apellido");
            String sApellido = entrada.next();
            System.out.println("Ingresar fecha de nacimiento");
            String fnacimiento = entrada.next();
            System.out.println("Ingresar sueldo");
            int sueldo = entrada.nextInt();
            System.out.println("Ingresar comision");
            double comision = entrada.nextDouble();
            System.out.println("Ingresar id del cargo");
            int idCargo = entrada.nextInt();
            System.out.println("Ingresar id del departamento");
            int idDepartamento = entrada.nextInt();
            con.insertarEmpleado(cedula,pNombre,sApellido,pApellido,sNombre,fnacimiento,sueldo,comision,idCargo,idDepartamento);
            
            System.out.println("Ingresar el historico");
            String fretiro = entrada.next();
            System.out.println("Ingresar cedula del empleado");
            int cedulah = entrada.nextInt();
            System.out.println("Ingresar id del cargo_ID");
            int icargo = entrada.nextInt();
            System.out.println("Ingresar id del departamento");
            int idepartamento = entrada.nextInt();
            con.insertarHistorico(fretiro, cedulah, icargo, idepartamento);
        }
        
        
        
       /*
        con.insertarCargo("contador", 1000, 1000);
        con.insertarPais("Colombia");
        con.insertarCiudad(1, "Bogota");
        con.insertarLocalizacion(1, "norte");
        con.insertarDepartamento(1, "finanzas");
        
        con.insertarEmpleado(1001196665,"jhoan", "mateo", "franco", "vargas","27/06/2022",1000,10.0, 1, 1);
        con.insertarHistorico("28/06/2022", 1001196665, 1, 1);
        System.out.println("se completo");*/
        
        
        
    }
}
