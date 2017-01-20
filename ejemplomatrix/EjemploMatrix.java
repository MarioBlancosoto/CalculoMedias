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
public class EjemploMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrixPrueba[][] = new int[2][3];
        Matrix.rellena(matrixPrueba);
        System.out.println(Arrays.deepToString(matrixPrueba));
        System.out.println("Nota media total: " + Matrix.calculoMedia(matrixPrueba));
        System.out.println("Nota media de una asignatura " + Matrix.calculoMediaAlumno(matrixPrueba));

    }

}
