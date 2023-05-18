package HomeWork.HW8;

public class Animal {
    void voice () {
        System.out.print("Talk ");
    }

    void eat (String food) {
        switch (food) {
            case "Meat" -> System.out.println("Я люблю есть мясо");
            case "Grass" -> System.out.println("Я люблю есть траву");
            default -> System.out.println("Я это не ем");
        }
    }
}
