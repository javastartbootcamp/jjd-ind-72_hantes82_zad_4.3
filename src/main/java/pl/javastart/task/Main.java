package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(square.calculateSquareArea(square));
        System.out.println(circle.calculateCircleArea(circle));
        System.out.println(triangle.calculateTrianglePerimeter(triangle));
        System.out.println(rectangle.calculateRectPerimeter(rectangle));
    }
}
