package HomeWork.HW8;

public class Tiger extends Animal {
    @Override
    void voice() {
        super.voice();
        System.out.println("RRR");
    }

    @Override
    void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("I like to eat meat ");
            default -> System.out.println("I don't like this");
        }
    }
}
