package code;

import java.util.Scanner;

// Link https://www.aceptaelreto.com/problem/statement.php?id=533&cat=125
public class BotellaGanadora {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos;
        if ((numCasos = ent.nextInt()) == 0) {
            return;
        }
        for (int i = 0; i < numCasos; i++) {
            int numBotelles = ent.nextInt()*8;
            int sum = 0;
            int ordre=1;
            int guanyador=-1;
            do{
                int botActual=ent.nextInt();
                if(botActual==-0) break;
                sum += botActual;
                if(sum>=numBotelles){
                    if(guanyador==-1)  guanyador=ordre;
                    else continue;
                }
                ordre++;
            }while(true);
            System.out.println(guanyador!=-1?guanyador:"SIGAMOS RECICLANDO");
        }

    }
}
