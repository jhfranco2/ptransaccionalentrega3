/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.sockets.controlador;

import com.app.sockets.conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ing.mateo
 */
public class Controlador {
    private Conexion conectar;
    private Connection con;
    
    public Controlador(){
    conectar = new Conexion();
    }
    
    public void insertarCargo(String nombre ,int cargo_sueldo_minimo,int cargo_sueldo_maximo){
        PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into cargo(cargo_nombre,cargo_sueldo_minimo,cargo_sueldo_maximo) values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, cargo_sueldo_minimo);
            ps.setInt(3, cargo_sueldo_maximo);
            ps.executeUpdate();
            System.out.println("exito");
        }catch(SQLException e){
            
            System.out.println(e);
        }
    }
    
    public void insertarPais(String pais_nombre ){
    PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into pais(pais_nombre) values(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pais_nombre);
            
            ps.executeUpdate();
           
           System.out.println("exito");
        }catch(SQLException e){
            
            System.out.println(e);
        }
    }
    public void insertarCiudad(int ciudad_pais_ID,String ciud_nombre){
        PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into ciudad(ciud_pais_ID,ciud_nombre) values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,ciudad_pais_ID );
            ps.setString(2, ciud_nombre);
            
            ps.executeUpdate();
           System.out.println("exito");
        }catch(SQLException e){
            
            System.out.println(e);
        }
        
    
    }
    
    public void insertarLocalizacion(int localiz_ciudad_ID,String localiz_dirreccion){
    PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into localizacion(localiz_ciudad_ID,localiz_direccion) values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,localiz_ciudad_ID );
            ps.setString(2,localiz_dirreccion);
            
            ps.executeUpdate();
           
        System.out.println("exito");
        }catch(SQLException e){
            
            System.out.println(e);
        }
    }
    public void insertarDepartamento(int dpto_localiz_ID,String dpto_nombre){
    PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into departamento(dpto_localiz_ID,dpto_nombre) values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,dpto_localiz_ID);
            ps.setString(2,dpto_nombre);
            
            ps.executeUpdate();
            
        System.out.println("exito");
        }catch(SQLException e){
            
            System.out.println(e);
        }
    }
    public void insertarEmpleado(int emplID,String primerNombre,String segundoNombre,String primerApellido,String segundoApellido,String fehaNacimiento,int emplSueldo,Double emplComision,int emplCargo,int empDpto){
    PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into empleado(empl_ID,empl_primer_nombre,empl_segundo_nombre,empl_primer_apellido,empl_segundo_apellido,empl_fecha_nac,empl_sueldo,empl_comision,empl_cargo_ID,empl_dpto_ID) values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, emplID);
            ps.setString(2,primerNombre);
            ps.setString(3,segundoNombre);
            ps.setString(4,primerApellido);
            ps.setString(5,segundoApellido);
            ps.setString(6,fehaNacimiento);
            ps.setInt(7, emplSueldo);
            ps.setDouble(8,emplComision);
            ps.setInt(9,emplCargo);
            ps.setInt(10,empDpto);
            ps.executeUpdate();
            
        System.out.println("exito");
        }catch(SQLException e){
            
            System.out.println(e);
        }
    }
    /*public void insertarGerente(int grnt_empl_ID){
        PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into gerente(grnt_empl_ID) values(?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,grnt_empl_ID);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    
    }*/
    public void insertarHistorico(String hisFechaRetiro,int emplID,int cargoID, int dpto_ID){
    PreparedStatement ps;
        String sql;
        
        try{
            con = conectar.conectar();
            sql = "insert into historico(emphist_fecha_retiro,emphist_empl_ID,emphist_cargo_ID,emphist_dpto_ID) values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,hisFechaRetiro);
            ps.setInt(2, emplID);
            ps.setInt(3, cargoID);
            ps.setInt(4,dpto_ID);
            
            
            ps.executeUpdate();
            System.out.println("exito");
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
}
