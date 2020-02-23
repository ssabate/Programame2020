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
// Link https://www.aceptaelreto.com/problem/statement.php?id=226
public class ReescribiendoFracciones {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int z = 0;
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            z = Integer.valueOf(ent.nextLine());
            for (int y = 1; y < 2*z+1; y++) {
                if ((y != z) && (z*y)/(y-z) > 0 && (z*y)%(y-z) == 0) sum += 1;
            }
            System.out.println(sum);
        }
        
    }
}
