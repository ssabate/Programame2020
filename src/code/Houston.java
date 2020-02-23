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
 * @author alumne
 */
// http://www.programa-me.com/documents/ProblemsSets/2019/ProgramaMe-2019-MadridTerrassa.pdf
public class Houston {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int x, y;
        int[] a_groups, a_values, b_groups, b_values;
        try {
            while (true) {
                x = ent.nextInt();
                y = ent.nextInt();
                a_groups = new int[x];
                a_values = new int[x];
                b_groups = new int[y];
                b_values = new int[y];
                for (int i = 0; i < a_groups.length; i++) {
                    a_groups[i] = ent.nextInt();
                    a_values[i] = ent.nextInt();
                }
                for (int i = 0; i < b_groups.length; i++) {
                    b_groups[i] = ent.nextInt();
                    b_values[i] = ent.nextInt();
                }
                
                int repa = 0, repb = 0, posa = 0, posb = 0, sum = 0;
                while (posa < a_groups.length || posb < b_groups.length) {
                    if (repa < a_groups[posa]) {
                        repa++;
                    }
                    else {
                        posa++;
                        repa = 0;
                    }
                    if (repb < b_groups[posb]) {
                        repb++;
                    }
                    else {
                        posb++;
                        repb = 0;
                    }
                    sum += a_values[posa] * b_values[posb];
                    System.out.println(sum);
                }
                System.out.println(sum);
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}



// MEMORY LIMIT EXCEEDED

//int x, y, a, b, c, d;
//        long sum;
//        ArrayList arrayL1;
//        ArrayList arrayL2;
//        try {
//
//            while (true) {
//                sum = 0;
//                arrayL1 = new ArrayList<>();
//                arrayL2 = new ArrayList<>();
//                x = ent.nextInt();
//                y = ent.nextInt();
//                for (int i = 0; i < x; i++) {
//                    a = ent.nextInt();
//                    b = ent.nextInt();
//                    for (int j = 0; j < a; j++) {
//                        arrayL1.add(b);
//                    }
//                }
//                for (int i = 0; i < y; i++) {
//                    c = ent.nextInt();
//                    d = ent.nextInt();
//                    for (int j = 0; j < c; j++) {
//                        arrayL2.add(d);
//                    }
//                }
//                for (int i = 0; i < arrayL1.size(); i++) {
//                    sum += (int)arrayL1.get(i) *(int)arrayL2.get(i);
//                }
//                System.out.println(sum);
//            }
//        } catch (Exception e) {}