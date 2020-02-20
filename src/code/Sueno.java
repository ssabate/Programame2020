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
// https://www.aceptaelreto.com/problem/statement.php?id=184&potw=1
// Si se posa sueño peta per la ñ!!
public class Sueno {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int hora1, min1, hora2, min2, suma_minuts, h_result, min_result;
        String interval;
        int x = Integer.valueOf(ent.nextLine());
        while (x != 0) {
            suma_minuts = 0;
            for (int i = 0; i < x; i++) {
                interval = ent.nextLine();
                hora1 = Integer.valueOf(interval.substring(0,2));
                min1 = Integer.valueOf(interval.substring(3,5));
                hora2 = Integer.valueOf(interval.substring(6,8));
                min2 = Integer.valueOf(interval.substring(9,11));
                while (hora1 != hora2 || min1 != min2) {
                    suma_minuts++;
                    min1++;
                    if (min1 == 60) {
                        min1 = 0;
                        hora1++;
                    }
                    if (hora1 == 24) hora1 = 0;
                }
            }
            h_result = suma_minuts / 60;
            min_result = suma_minuts % 60;
            if (h_result < 10) System.out.print("0"+h_result);
            else System.out.print(h_result);
            System.out.print(":");
            if (min_result < 10) System.out.print("0"+min_result);
            else System.out.print(min_result);
            System.out.println();
            x = Integer.valueOf(ent.nextLine());
        }
    }
}
