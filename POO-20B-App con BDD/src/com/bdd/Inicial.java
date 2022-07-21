/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdd;

/**
 *
 * @author MacArthur
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BDD bdd;
        System.out.println("Conexion a bDD");
        bdd = new BDD();
        bdd.ReporteBdd();
        bdd.InsertarBdd(8, "Mesa", 45);
        bdd.ReporteBdd();

    }
    
}
