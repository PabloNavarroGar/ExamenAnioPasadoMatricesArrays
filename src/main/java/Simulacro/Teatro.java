/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacro;

/**
 *
 * @author samue
 */
public class Teatro {

    private char[][] asientos;
    private int filas;
    private int columnas;

    public Teatro(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        asientos = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((i + j) % 2 == 0) {
                    asientos[i][j] = 'X';
                } else {
                    asientos[i][j] = 'L';
                }
            }
        }
    }

    public boolean reservarAsiento(int fila, int columna) {
        if (fila < 1 || fila > filas || columna < 1 || columna > columnas || asientos[fila - 1][columna - 1] != 'L') {
            return false;
        }
        asientos[fila - 1][columna - 1] = 'V';
        return true;
    }

    public boolean cancelarAsiento(int fila, int columna) {
        if (fila < 1 || fila > filas || columna < 1 || columna > columnas || asientos[fila - 1][columna - 1] == 'X') {
            return false;
        }
        asientos[fila - 1][columna - 1] = 'L';
        return true;
    }

    public void imprimirTeatro() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

  
}
