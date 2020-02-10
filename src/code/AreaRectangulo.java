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
// Link https://www.aceptaelreto.com/problem/statement.php?id=164
public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int x, y, z, t;
        x = ent.nextInt();
        y = ent.nextInt();
        z = ent.nextInt();
        t = ent.nextInt();
        while ((x < z || y < t)) {
            System.out.println((z-x) * (t-y));
            x = ent.nextInt();
            y = ent.nextInt();
            z = ent.nextInt();
            t = ent.nextInt();
        }
        
    }
}
