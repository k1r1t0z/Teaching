package LessonTask8;

public class Circle extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("Круг");
    }

    @Override
    void erase() {
        super.erase();
        System.out.println("Круг");
    }
}
