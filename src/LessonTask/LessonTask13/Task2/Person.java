package LessonTask.LessonTask13.Task2;

public class Person {
    public int age;

    public Person(int age) {
        if (age < 18) {
            throw new Exception();
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
