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
// https://www.aceptaelreto.com/problem/statement.php?id=512&cat=118
public class DonerSospechoso {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        try {
            int rep = Integer.valueOf(ent.nextLine());
            int x, y;
            for (int i = 0; i < rep; i++) {
                x = ent.nextInt();
                y = ent.nextInt();
                System.out.println(x * 100 / (x+y));
            }
        } catch (Exception e) {}
    }   
}
