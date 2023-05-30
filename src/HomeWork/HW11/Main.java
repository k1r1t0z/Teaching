package HomeWork.HW11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        /*String two = scanner.nextLine();
        String three = scanner.nextLine();*/
        // TASK1
        /*int[] array = {one.length(), two.length(), three.length()};
        String[] arrStr = {one, two, three};
        int min = array[0];
        int max = array[0];
        String minStr = arrStr[0];
        String maxStr = arrStr[0];
        for (int i = 0; i < array.length && i < arrStr.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
            if (maxStr.length() <= arrStr[i].length()) {
                maxStr = arrStr[i];
            }
            if (minStr.length() >= arrStr[i].length()) {
                minStr = arrStr[i];
            }
        }
        System.out.println("Минимальная строка и ее длина = " + minStr + " " + min);
        System.out.println("Максимальная строка и ее длина = " + maxStr + " " + max);*/

        // TASK 2
        /*String[] array = {one, two, three};
        Arrays.sort(array, Comparator.comparing(String :: length));
        System.out.println(Arrays.toString(array));*/

        // TASK 5
        String str = "";
        for (int i = 0; i < one.length(); i++) {
            str = str.concat(one.charAt(i) + "" + one.charAt(i));
        }
        System.out.println(str);
    }
}
