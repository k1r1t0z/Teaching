package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /*int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + number;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);*/

        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W" + " ");
                } else {
                    System.out.print("B" + " ");
                }
            }
            System.out.println();
        }
    }
}

