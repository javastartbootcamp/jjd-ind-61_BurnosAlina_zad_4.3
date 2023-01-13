package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(2.5);
        Rectangle rectangle1 = new Rectangle(3, 4.5);
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(2.5, 4, 5.5);
        ShapeCalculator calc = new ShapeCalculator();
        System.out.println("Kwadrat o boku a = " + square1.a + " ma pole = " + calc.calculateSquareArea(square1));
        System.out.println("Prostokat o bokach a = " + rectangle1.a + ", b = " + rectangle1.b + " ma obwod = "
                + calc.calculateRectPerimeter(rectangle1));
        System.out.println("Kolo o promieniu r = " + circle1.r + " ma pole = " + calc.calculateCircleArea(circle1));
        System.out.println("Trojkat o bokach a = " + triangle1.a + ", b = " + triangle1.b + ", c = " + triangle1.c
                + " ma obwod = " + calc.calculateTrianglePerimeter(triangle1));
    }
}
