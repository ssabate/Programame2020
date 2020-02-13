/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

// Link https://www.aceptaelreto.com/problem/statement.php?id=156
public class Ascensor {
    
    public static int diference(int x, int y) {
        if (x > y) return x - y;
        return y - x;
    }
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        boolean ascensor = false;
        int x, y;
        while (true) {
            int sum = 0;
            y = ent.nextInt();
            if (y == -1) break;
            while (true) {
                ascensor = true;
                x = y;
                y = ent.nextInt();
                if (y == -1) {
                    break;
                }
                sum += diference(x,y);
            }
            System.out.println(sum);
        }
            
    }
}
