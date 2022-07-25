/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    private Object[][] matriz_estudiantes;

    public Ejercicio10(int tamaño) {
        if (tamaño <= 0) {
            tamaño = 10;
        }
        tamaño++;
        this.matriz_estudiantes = new Object[tamaño][6];
        this.matriz_estudiantes[0][0] = "Estudiante";
        this.matriz_estudiantes[0][1] = "Nota 1";
        this.matriz_estudiantes[0][2] = "Nota 2";
        this.matriz_estudiantes[0][3] = "Nota 3";
        this.matriz_estudiantes[0][4] = "Promedio";
        this.matriz_estudiantes[0][5] = "Estado";
        LlenarEstudiantes();
        LlenarNotas();

    }

    public void LlenarEstudiantes() {
        int numEst = this.matriz_estudiantes.length;
        for (int i = 1; i < numEst; i++) {
            this.matriz_estudiantes[i][0] = this.matriz_estudiantes[0][0] + " " + i;
        }
    }

    public void LlenarNotas() {
        int numEst = this.matriz_estudiantes.length;
        double nota;
        for (int i = 1; i < numEst; i++) {
            for (int j = 1; j < 4; j++) {
                nota = (double) (Math.random() * 10 + 1);
                nota = Math.round(nota*100.0)/100.0;
                this.matriz_estudiantes[i][j] = nota;
            }
        }
    }

    public void LlenarAprobaciones() {
        int numEst = this.matriz_estudiantes.length;
        double promedio;
        for (int i = 1; i < numEst; i++) {
            promedio = ((double) this.matriz_estudiantes[i][1]
                    + (double) this.matriz_estudiantes[i][2]
                    + (double) this.matriz_estudiantes[i][3]) / 3;
            promedio = Math.round(promedio*100.0)/100.0;
            this.matriz_estudiantes[i][4] = promedio;            
            
            if (promedio >= 7) {
                this.matriz_estudiantes[i][5] = "Aprobado";
            } else if (promedio >= 5) {
                this.matriz_estudiantes[i][5] = "Supletorio";
            } else {
                this.matriz_estudiantes[i][5] = "Reprobado";
            }
        }
    }

    public String Imprimir() {
        String datos = "";
        int numEst = this.matriz_estudiantes.length;
        for (int i = 0; i < numEst; i++) {
            for (int j = 0; j < 6; j++) {
                datos += this.matriz_estudiantes[i][j] + "\t";
            }
            datos += "\n";
        }
        return datos;
    }
}
