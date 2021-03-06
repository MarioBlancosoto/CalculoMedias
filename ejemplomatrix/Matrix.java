/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatrix;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Matrix {

    public static int pedirNota() {
        int resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota: "));
        while (resultado < 1 || resultado > 10) {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota: "));
        }
        return resultado;
    }

    public static void rellena(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = pedirNota();
            }
        }
    }

    //Para visualizar, visualizamos con Arrays.deepToString() mejor que con esto
    public static int[][] visualiza(int matrix[][]) { //Una matriz es un vector de vectores
        for (int[] i : matrix) { //Primero se recorre el primer array
            for (int j : i) { //Despues se recorre cada posicion de ese array
                System.out.println(j);
            }
        }
        return matrix;
    }

    public static int calculoMedia(int matrix[][]) {
        int media = 0, suma = 0, aux = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                suma += j;
                aux++;
            }
        }
        return media = suma / aux;
    }

    public static int pideAlumno() {
        int alumno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumno: "));
        while (1 > alumno || alumno > 2) {
            alumno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumno: "));
        }
        return alumno;
    }

    public static int calculoMediaAlumno(int matrix[][]) {
        int media = 0, suma = 0, aux = 0;
        int a = pideAlumno();
        int notasMedias[] = new int[2];
        for (int i = a - 1; i < a; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                suma += matrix[i][j];
                aux++;
            }
        }

        return media = suma / aux;
    }
}
