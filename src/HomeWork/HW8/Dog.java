package HomeWork.HW8;

public class Dog extends Animal {
    @Override
    void voice() {
        super.voice();
        System.out.println("woof woof");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("I like to eat meat ");
            default -> System.out.println("I don't like this");
        }
    }
}
