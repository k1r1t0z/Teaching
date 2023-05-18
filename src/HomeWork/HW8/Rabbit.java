package HomeWork.HW8;

public class Rabbit extends Animal {
    @Override
    void voice() {
        super.voice();
        System.out.println("baf baf");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Grass" -> System.out.println("I like to eat grass");
            default -> System.out.println("I don't like this");
        }
    }
}
