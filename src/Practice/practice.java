package Practice;

import java.util.Random;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /*System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));*/

        int a = scanner.nextInt();
        int b;
        for (int i = 1; i <= 10; i++) {
            b = a * i;
            System.out.println(a + " х " + i + " = "+ b);
        }

    }
}
