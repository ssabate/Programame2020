package code;

import java.util.Scanner;

// Link https://www.aceptaelreto.com/problem/statement.php?id=533&cat=125
public class BotellaGanadora {
    
      public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        do {
            int x, y=-2, fx;
            if((fx = ent.nextInt())< 0) break;
            int sum=0;
            
            do {
                x = ent.nextInt();
                if(x==-1) break;
                sum+=Math.abs(fx-x);
                y = ent.nextInt();
                sum += Math.abs(x-y);
                fx=y;
            }while (true);
            System.out.println(sum);
        }while (true);
            
    }
}
