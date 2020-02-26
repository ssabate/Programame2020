/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
//http://www.programa-me.com/documents/ProblemsSets/2019/ProgramaMe-2019-MadridTerrassa.pdf
public class EmpleadoDelAno {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        try {
            while (true) {
                int entrades = ent.nextInt();
                int x, mitjanes = 0, sortida;
                for (int i = 1; i <= entrades; i++) {
                    x = ent.nextInt();
                    sortida = x*i-mitjanes;
                    if (i != entrades) System.out.print(sortida + " ");
                    else System.out.print(sortida);
                    mitjanes += sortida;
                }
                System.out.println();
            }
            
        } catch (Exception e) {}
    }
}
