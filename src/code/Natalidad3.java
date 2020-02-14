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
public class Natalidad3 {

    static boolean uno, dos;


    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        do {
            String linia = ent.nextLine().trim();
            if (linia.equals(".")) {
                break;
            }

            if (linia.length() == 3) {
                System.out.println("12");
            } else {
                tractarLinia(linia);
                if (uno == dos) {
                    System.out.println("N");
                } else {
                    if (uno) {
                        System.out.println("1");
                    }
                    if (dos) {
                        System.out.println("2");
                    }
                }
            }

        } while (true);

        
    }
    
    public static void tractarLinia(String s){
        uno=s.contains("...");
        int _2=s.indexOf("..");
        dos=_2!=-1 && (_2==s.length()-2 || s.charAt(_2+2)!='.') && s.charAt(_2-1)!='.';
        while(!dos){
             _2=s.indexOf("..",_2+1);
            if(_2==-1) break;
            dos=(_2==s.length()-2 || s.charAt(_2+2)!='.') && s.charAt(_2-1)!='.';
        }
        
    }
}
