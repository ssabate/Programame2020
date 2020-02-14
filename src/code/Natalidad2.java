/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import static code.Natalidad.uno;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Natalidad2 {

    static boolean uno, dos;

    static class Arbre {

        Node arrel = null;

//        public Arbre(Node node) {
//            arrel = node;
//
//        }
        private Node addRecursive(Node current, char value) {
            if (current == null) {
                return new Node(value, 0);
            }
//            if (value != '.') {
                while (current.fEsq != null && current.v != '.') {
                    current = current.fEsq;
                }
                if (current.v != '.') {
                    if(value!='.')current.numFills++;
                    current.fEsq = addRecursive(current.fEsq, value);
                    current.fEsq.pare=current;
                } else {
                    current = current.pare;
                    while (current.fDret != null && current.pare!=null) {
                        current = current.pare;
                    }
                    if (current.v != '.') {
                        if(value!='.') current.numFills++;
                        current.fDret = addRecursive(current.fDret, value);
                        current.fDret.pare=current;
                    }

                }
  //          }
            return current;
        }

        public void add(char value) {
            arrel = addRecursive(arrel, value);
        }

        static class Node {

            Node pare;
            char v;
            int numFills = 0;
            Node fEsq;
            Node fDret;

            public Node(char v, int numFills) {
                this.v = v;
                this.numFills = numFills;
                fEsq = fDret = pare = null;
            }

            public void afegirEsquerre(Node arbre) {
                this.fEsq = arbre;
            }

            public void afegirDreta(Node arbre) {
                this.fDret = arbre;
            }
        }

        private static boolean containsNodeRecursive(Node current, int value) {
            if (current == null) {
                return false;
            }
            if (value == current.numFills) {
                return true;
            }
            return containsNodeRecursive(current.fEsq, value)
                    || containsNodeRecursive(current.fDret, value);
        }

        public static void tractarArbre(Arbre a) {

            uno = containsNodeRecursive(a.arrel, 1);
            dos = containsNodeRecursive(a.arrel, 2);
        }

    }

    public static Arbre tractarLinia(String s) {

        Arbre a = new Arbre();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //Object object = arr[i];
            switch (c) {
                case ',':
                    break;
                default:
                    a.add(c);
            }

        }
        return a;
    }

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
                uno = dos = false;
                Arbre.tractarArbre(tractarLinia(linia));
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

            //d.add(linia);
        } while (true);

    }
}
