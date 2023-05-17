package LessonTask6;

public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator(2, "Black", 4);
        System.out.println(myCalc.findSum(9, 9));
        System.out.println(myCalc.color);
        System.out.println(myCalc.cost);
        System.out.println(myCalc.weight);
    }
}
