package HomeWork.HW7.Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "Black");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        apple.info();
    }
}
