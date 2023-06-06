package LessonTask.LessonTask13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 2423;
        num[1] = 2424;
        num[2] = 2424;

        try {
            num[3] = 2424;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num));
        }
    }
}
