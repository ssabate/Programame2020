/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class EsotericoDiabolico {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        do {

            int n = ent.nextInt();

            if (n==0) {
                break;
            }

            int[][] valors = new int[n][n];
            boolean[] tots = new boolean[n * n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    valors[i][j]=ent.nextInt();
                    
                }
            }

            boolean diabolic = true, esoteric = true;
            int cm = 0;
            int sumaDiag1=0, sumaDiag2=0;
                
            for (int i = 0; i < n && diabolic; i++) {
                int sumaFila = 0, sumaColumna=0;
                for (int j = 0; j < n && diabolic; j++) {
                    sumaFila += valors[i][j];
                    sumaColumna += valors[j][i];
                    if(i==j) sumaDiag1 += valors[i][j];
                    if(i+j==n-1) sumaDiag2 += valors[i][j];

                    try {
                        if (!tots[valors[i][j] - 1]) {
                            tots[valors[i][j] - 1] = true;
                        } else {
                            diabolic = false;
                        }
                    } catch (Exception e) {
                        esoteric = false;
                    }
                }
                if (cm == 0) {
                    cm = sumaFila;
                } else {
                    diabolic = (cm == sumaFila && cm == sumaColumna);
                }
            }
            
            if(diabolic) diabolic = (cm == sumaDiag1 && cm == sumaDiag2);
            
            if (diabolic && esoteric) {

                int cm2 = 4 * cm / n;
                //Serà isotèric si les 4 cantonades sumen la 2ª constant màgica
                if (esoteric = (cm2 == valors[0][0] + valors[0][n - 1] + valors[n - 1][0] + valors[n - 1][n-1])) {
                    if (n % 2 == 0) {
                        //La suma de las dos casillas centrales de cada uno de los cuatro laterales suman el doble de la constante mágica 2 (2 · CM2)
                        //La suma de las cuatro casillas centrales da como resultado la constante mágica 2.
                        esoteric = (2 * cm2 == valors[0][n / 2] + valors[0][n / 2 - 1] + valors[(n / 2)][0] + valors[(n / 2) - 1][0] + valors[(n / 2)][n-1] + valors[n / 2- 1][n-1] + 
                                valors[n-1][ n / 2] + valors[n-1][ n / 2 - 1]);
                        esoteric = esoteric &&         (cm2 == valors[n/2][n / 2] + valors[n/2][ n / 2 - 1] + valors[n/2-1][ n / 2] + valors[n/2-1][ n / 2 - 1]);
                    } else {
                        //La suma de las cifras de las cuatro casillas de la mitad de los laterales suman la constante mágica 2.
                        //Si se multiplica el valor de la casilla central por 4, se obtiene la constante mágica 2.
                        esoteric = (cm2 == 4 * valors[n/2][n / 2]);
                        esoteric= esoteric  && (cm2 == valors[0][n / 2] + valors[(n / 2)][0] + valors[n/2][n-1] + valors[n-1][ n / 2]);
                    }

                }

                if (esoteric) {
                    System.out.println("ESOTERICO");
                } else {
                    System.out.println("DIABOLICO");
                }
            } else {
                if (diabolic) {
                    System.out.println("DIABOLICO");
                } else {
                    System.out.println("NO");
                }
            }

        } while (true);

    }
}
