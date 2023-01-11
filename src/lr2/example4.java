package lr2;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        if(num>=5 && num<=10){
            System.out.println("Удовлетворяет условиям");
        } else {
            System.out.println("Не удовлетворяет условиям");
        }
    }
}
