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
public class ReescribiendoFracciones {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int z = 0;
        while (true) {
            int sum = 0;
            z = ent.nextInt();
            for (int y = 1; y < 2*z+1; y++) {
                boolean prova = (y != z) && (z*y)/(y-z) > 0 && (z*y)%(y-z) == 0;
                if ((y != z) && (z*y)/(y-z) > 0 && (z*y)%(y-z) == 0) sum += 1;
            }
            System.out.println(sum);
        }
        
    }
}
