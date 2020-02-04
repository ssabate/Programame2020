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

            String linia = ent.nextLine();

            if (linia.equals("0")) {
                break;
            }

            int n = Integer.parseInt(linia);

            String[] nums = ent.nextLine().split(" ");
            int[] valors = new int[nums.length];
            boolean[] tots = new boolean[n * n];

            for (int i = 0; i < nums.length; i++) {
                valors[i] = Integer.parseInt(nums[i]);
            }

            boolean magic = true, esoteric=true;
            int cm = 0;
            for (int i = 0; i < n * n && magic; i = i + n) {
                int suma = 0;
                for (int j = 0; j < n && magic; j++) {
                    suma += valors[i + j];
                    try {
                        if (!tots[valors[i + j] - 1]) {
                            tots[valors[i + j] - 1] = true;
                        } else {
                            magic = false;
                        }
                    } catch (Exception e) {
                        esoteric = false;
                    }
                }
                if (cm == 0) {
                    cm = suma;
                } else {
                    magic = (cm == suma);
                }

            }
            for (int i = 0; i < n && magic; i++) {
                int suma = 0;
                for (int j = 0; j < n * n && magic; j = j + n) {
                    suma += valors[i + j];
                }
                magic = (cm == suma);

            }
            
            if (magic) {
           
                 int cm2=4*cm/n;
                 if(esoteric=(cm2=valors[0]+valors[n-1]+valors[n*(n-1)]+valors[valors.length()-1])){
                    if(n%2==0){
                        //TODO
                        //La suma de las dos casillas centrales de cada uno de los cuatro laterales suman el doble de la constante mágica 2 (2 · CM2)
                        //La suma de las cuatro casillas centrales da como resultado la constante mágica 2.
                    }else{
                        //TODO
                        //La suma de las cifras de las cuatro casillas de la mitad de los laterales suman la constante mágica 2.
                        //Si se multiplica el valor de la casilla central por 4, se obtiene la constante mágica 2.
                    }
                 
                 }   
                
                if(esoteric) System.out.println("ESOTERICO");
                else System.out.println("DIABOLICO");
            }

        } while (true);

    }
}
