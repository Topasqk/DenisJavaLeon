package NewPack;

import java.util.Random;

public class Proverca {
    public static void main (String[] args){
        int a, b, c;
        Random r= new Random();
        for(int i=0; i<29; i++) {
            try {
                b=r.nextInt();
                c=r.nextInt();
                a=123/(b/c);
            }catch (ArithmeticException e){
                System.out.println("Дeлeниe на нуль.");
                a=0;
            }
            System.out.println( " a: " + a);
        }
        }
    }

