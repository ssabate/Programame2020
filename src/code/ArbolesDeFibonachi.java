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
     
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Integer> llista = new ArrayList<>();
        do {

            int n = ent.nextInt();
            
            if (n < 0){
                break;
            }
            
            llista.add(n);

        } while (true);
        for (int i = 0; i < llista.size(); i++) {
            arbFib(llista.get(i), 0);
            System.out.format("====%n");
        }
    }
    public static void arbFib (int n, int nivell) {
        if (n == 0 || n == 1)  {
            System.out.format("%s%d%n", espais(nivell), n);      
            return;
        }
        System.out.format("%s%d%n", espais(nivell), fib(n));
        arbFib (n-2, nivell+1);
        arbFib (n-1, nivell+1);
    }
    
    public static int fib (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib (n - 2) + fib (n - 1);
    }
    
    public static String espais(int n){
        String tros="   ";
        String resultat="";
        for (int i = 0; i < n; i++) {
            resultat+=tros;            
        }
        return resultat;
        
    }
}
