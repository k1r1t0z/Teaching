package HomeWork;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println("\n");

//        Task 1

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("\n");

//        Task 2

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println(min + "\n");
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println(max + "\n");

//        Task 3

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(minIndex + " " + maxIndex + "\n");

        /*int[] array = {1, 3, 2, 5, 4};
        int minIndex = Arrays.binarySearch(array, 1);
        int maxIndex = Arrays.binarySearch(array, 5);
        System.out.println(minIndex + "\n" + maxIndex);*/

//        Task 6

        if (array[0] < array[1] & array[1] < array[2] & array[2] < array[3]) {
            System.out.println("Элементы массива идут по порядку");
        } else {
            System.out.println("Элементы массива идут не по порядку");
        }
        System.out.println("\n");

//        Task 5

        double tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

//        Task 4

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                a++;
            }
        }
        System.out.println(a);
    }

}

