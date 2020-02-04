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
public class CifradoCesar {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        do {
            //System.out.println('z'-'p');
            String cadena = ent.nextLine();

            char c = cadena.charAt(0);

            int dif = 'p' - c;

            String missatge = cadena.substring(1), desx = "";
            int cont = 0;

            for (int i = 0; i < missatge.length(); i++) {
                if (Character.isLowerCase(missatge.charAt(i))) {
                    int car = (int) missatge.charAt(i);
                    if (car + dif <= 122 && car + dif >= 97) {
                        car += dif;
                    } else {
                        if (car + dif > 122) {
                            car = (car+dif) % 122;
                            car += 96;
                        } else {
                            
                            car=122-(96-(car+dif));
                        }

                    }
                    desx = desx + (char) car;
                    //System.out.print((char)((missatge.charAt(i)+dif)%('z'-'a'+1))+'a');
                    //desx+=(char)(((missatge.charAt(i)-dif)%('z'-'a'+1))+'a');//((missatge.charAt(i)-dif)%('z'-'a'))+'a';
                    if ("aeiou".contains(Character.toString(desx.charAt(i)))) {
                        cont++;
                    }
                } else if (Character.isUpperCase(missatge.charAt(i))) {
                    int car = (int) missatge.charAt(i);
                    if (car + dif <= 90 && car + dif >= 65) {
                        car += dif;
                    } else {
                        if (car + dif > 90) {
                            car = (car+dif) % 90;
                            car += 64;
                        } else {
                            
                            car=90-(64-(car+dif));
                        }
                  

                    }
                    desx = desx + (char) car;
                    if ("AEIOU".contains(Character.toString(desx.charAt(i)))) {
                        cont++;
                    }
                } else {
                    desx += missatge.charAt(i);
                }
            }
            if (desx.equals("FIN")) {
                //System.out.println("");
                break;
            }
            System.out.println(cont);
        } while (true);
    }
}
