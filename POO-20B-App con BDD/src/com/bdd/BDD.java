/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author MacArthur
 */
public class BDD {
    
    public void ReporteBdd() 
    {
        Connection conn;
        Statement stmt;
        ResultSet rs;
        String sql;
        int id;
        String nombre;
        int precio;
        
        sql = "";
        try
        {
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Almacen","root","root");
            //System.out.println("Conectado correctamente....");
            stmt = conn.createStatement();
            sql = "select * from producto";
            rs = stmt.executeQuery(sql);
            System.out.println("Id     nombre     precio");
            while (rs.next()){
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                precio = rs.getInt("precio");
                
                System.out.println(id +"   "+nombre+"   "+precio);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
     public void InsertarBdd(int id, String nombre, int precio) 
    {
        Connection conn;
        Statement stmt;
        String sql;
        sql = "";
        try
        {
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Almacen","root","root");
            //System.out.println("Conectado correctamente....");
            stmt = conn.createStatement();
            sql = "insert into producto values ("+id+",'"+nombre+"',"+precio+")";
            stmt.executeUpdate(sql);
            System.out.println("Producto insertado con exito.....");
            
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: "+sql);
            System.out.println("Error: "+e.getMessage());
        }
    }
     
    
    
}
