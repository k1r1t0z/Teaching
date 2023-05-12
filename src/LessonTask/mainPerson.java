package LessonTask;

public class mainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Bill Gates", 23);

        person1.talk("Blabla");
        person2.move();
    }
}
