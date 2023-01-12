package NewPack;

import java.util.Arrays;
import java.util.Scanner;
public class Proverca {
public static void Number(int[] mass){
    int a;
        System.out.println("Введите число:");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
        for(int i=0; i<mass.length ; i++) {
        try {
            a=1/(num-mass[i]);
            System.out.println("нет совпадения:" + i);
        }catch (ArithmeticException e){
            System.out.println("элемент найден:" + mass[i]);
            mass[i]= 666;
        }
    }
        System.out.println(Arrays.toString(mass));

}

    public static void main (String[] args){
        int [] mass = { 2, 19, 24, 5, 8, 0, 71, 198, 100, 89};
        String[] array = new String[]{"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число:");
        Scanner scan1 = new Scanner(System.in);
        int str = scan1.nextInt();
        array[str]= null;
        System.out.println(Arrays.toString(array));
        Number(mass);
        }
    }

