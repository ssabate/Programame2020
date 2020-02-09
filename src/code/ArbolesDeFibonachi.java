/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joan
 */
public class ArbolesDeFibonachi {
    static int fill = 0;
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Integer> llista = new ArrayList<>();
        do {
            String linia = ent.nextLine();

            int n = Integer.parseInt(linia);
            
            if (n < 0){
                break;
            }
            
            llista.add(n);

        } while (true);
        for (int i = 0; i < llista.size(); i++) {
            arbFib(llista.get(i));
            System.out.println("====");
        }
        System.out.println("");
    }
    public static void arbFib (int n) {
        for (int j = 0; j < fill; j++) {
            System.out.format("   ");
        }
        if (n < 0){
           return;
        }
        if (n == 0 || n == 1)  {
            System.out.println(n);      
            return;
        }
        System.out.println(fib(n));
        fill ++;
        arbFib (n-2);
        arbFib (n-1);
        fill = 0;
    }
    
    public static int fib (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib (n - 2) + fib (n - 1);
    }
}
