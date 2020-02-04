/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class EsotericoDiabolico {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        do {

            String linia = ent.nextLine();

            if (linia.equals("0")) {
                break;
            }

            int n = Integer.parseInt(linia);

            String[] nums = ent.nextLine().split(" ");
            int[] valors = new int[nums.length];
            boolean[] tots = new boolean[n * n];

            for (int i = 0; i < nums.length; i++) {
                valors[i] = Integer.parseInt(nums[i]);
            }

            boolean magic = true;
            int cm = 0;
            for (int i = 0; i < n * n && magic; i = i + n) {
                int suma = 0;
                for (int j = 0; j < n && magic; j++) {
                    suma += valors[i + j];
                    try {
                        if (!tots[valors[i + j] - 1]) {
                            tots[valors[i + j] - 1] = true;
                        } else {
                            magic = false;
                        }
                    } catch (Exception e) {
                        magic = false;
                    }
                }
                if (cm == 0) {
                    cm = suma;
                } else {
                    magic = (cm == suma);
                }

            }
            for (int i = 0; i < n && magic; i++) {
                int suma = 0;
                for (int j = 0; j < n * n && magic; j = j + n) {
                    suma += valors[i + j];
                }
                magic = (cm == suma);

            }
            if (magic) {
                System.out.println("DIABOLICO");
            }

        } while (true);

    }
}
