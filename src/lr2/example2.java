package lr2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();

        //for(int i = 0; i < 1000 ; i++) if (i%5==2 && i%7==1) System.out.println(i);

        if(num%5==2 && num%7==1){
            System.out.println("Условиям удовлетворяет");
        } else {
            System.out.println("Условиям не удовлетворяет");
        }
    }
}
