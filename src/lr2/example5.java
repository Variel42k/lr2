package lr2;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.println("В числе " + num + " - " + num/1000 + " тысяч.");
    }
}
