/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraccionario;

import java.io.Serializable;



/**
 *
 * @author Kevin
 */
public class Fraccionario implements Serializable{
    
        private double numerador;
        private double denominador;

        public Fraccionario(double numerador, double denominador)
        {
            this.numerador = numerador;
            if (denominador != 0)
                this.denominador = denominador;
            else
                this.denominador = 1;
        }
        
        public  void setNumerador(double numerador){
        this.numerador=numerador;       
        }
        public  void setDenominador(double denominador){
            if (denominador==0) {
                this.denominador=1;
            }
            else   this.denominador=denominador;  
        }
        
        public double getNumerador(){
        return this.numerador;
        }
        
        public double getDenominador(){
        return this.denominador;
        }

       


        public Fraccionario Suma(double numerador2, double denominador2)
        {
            double numerador = this.numerador * denominador2 + this.denominador * numerador2;
            double denominador = this.denominador * denominador2;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }


        public Fraccionario Suma(Fraccionario fraccion)
        {
            double numerador = this.numerador * fraccion.denominador + this.denominador * fraccion.numerador;
            double denominador = this.denominador * fraccion.denominador;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }



        //-----------------------------------------------------------


        public Fraccionario Resta(double numerador2, double denominador2)
        {
            double numerador = this.numerador * denominador2 - this.denominador * numerador2;
            double denominador = this.denominador * denominador2;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }



        public Fraccionario Resta(Fraccionario fraccion)
        {
            double numerador = this.numerador * fraccion.denominador - this.denominador * fraccion.numerador;
            double denominador = this.denominador * fraccion.denominador;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }


        

        //-----------------------------------------------------------


        public Fraccionario Multiplicar(double numerador2, double denominador2)
        {
            double numerador = this.numerador * numerador2;
            double denominador = this.denominador * denominador2;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }


        public Fraccionario Multiplicacion(Fraccionario fraccion)
        {
            double numerador = this.numerador * fraccion.numerador;
            double denominador = this.denominador * fraccion.denominador;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }


       


        //-----------------------------------------------------------


        public Fraccionario Division(double numerador2, double denominador2)
        {
            double numerador = this.numerador * denominador2;
            double denominador = this.denominador * numerador2;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }


        public Fraccionario Division(Fraccionario fraccion)
        {
            double numerador = this.numerador * fraccion.denominador;
            double denominador = this.denominador * fraccion.numerador;
            Fraccionario f = new Fraccionario(numerador, denominador);
            return f;
        }


       

        //-----------------------------------------------------------

        public String toString()
        {
            if (denominador == 1)
                return "" + this.numerador;
            else
                return this.numerador + "/" + this.denominador;
        }

       

        
}
