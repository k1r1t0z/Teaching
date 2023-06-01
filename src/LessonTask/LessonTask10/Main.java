package LessonTask.LessonTask10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String line = "Hello world";
        System.out.println(line + "!");
        System.out.println(line.concat("!"));
        System.out.println(line.equals("Hello world"));
        System.out.println(line.equalsIgnoreCase("hello world"));
        System.out.println(line.substring(3));
        System.out.println(line.length());
        System.out.println(line.indexOf("l"));
        System.out.println(String.valueOf(true));
        System.out.println(line.toUpperCase());
        System.out.println(line.replace("l", "1"));
        System.out.println(line.trim());
        System.out.println(line.isEmpty());
        System.out.println(Arrays.toString(line.split(" ")));*/

        /*StringBuilder stringBuilder = new StringBuilder("Bye world");
        stringBuilder.append("xxxx");
        stringBuilder.insert(5,"y");
        stringBuilder.delete(3,6);
        stringBuilder.reverse();
        String str = stringBuilder.toString();
        System.out.println(str);*/
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i ++) {
            array[i] = scanner.nextInt();
        }
    }
}
