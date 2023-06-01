package InfoLesson;

public class Main {
    public static void main(String[] args) {
        String testLine = "Hello from group 67";

        String pattern = ""; // 1 - что ищем, сколько ищем

        System.out.println(testLine.replaceAll(pattern, "FOUND"));
    }
}
