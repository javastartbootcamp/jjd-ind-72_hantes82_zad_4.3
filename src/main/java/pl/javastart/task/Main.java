package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(3, 4, 5);
        ShapeCalculator shapecalculator = new ShapeCalculator();
        System.out.println(shapecalculator.calculateSquareArea(square));
        System.out.println(shapecalculator.calculateCircleArea(circle));
        System.out.println(shapecalculator.calculateTrianglePerimeter(triangle));
        System.out.println(shapecalculator.calculateRectPerimeter(rectangle));
    }
}
