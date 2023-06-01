package LessonTask.LessonTask6;

public class Calculator {
    int weight;
    String color;
    double cost;

    public Calculator(int weight, String color, double cost) {
        this.weight = weight;
        this.color = color;
        this.cost = cost;
    }

    int findSum(int a, int b) {
        return a + b;
    }

    {
        System.out.println("Создается объект калькулятор");
    }

    int findMinus(int a, int b) {
        return a - b;
    }

    int findYmn(int a, int b) {
        return a * b;
    }

    double findDel(int a, int b) {
        return a / b;
    }
}
