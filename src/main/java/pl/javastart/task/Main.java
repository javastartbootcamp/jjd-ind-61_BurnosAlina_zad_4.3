package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(2.5);
        Rectangle rectangle1 = new Rectangle(3, 4.5);
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(2.5, 4, 5.5);
        System.out.println("Kwadrat o boku a = " + square1.getA() + " ma pole = "
                + square1.calculateSquareArea(square1.getA()));
        System.out.println("Prostokat o bokach a = " + rectangle1.getA() + ", b = " + rectangle1.getB() + " ma obwod = "
                + rectangle1.calculateRectPerimeter(rectangle1.getA(), rectangle1.getB()));
        System.out.println("Kolo o promieniu r = " + circle1.getR() + " ma pole = "
                + circle1.calculateCircleArea(circle1.getR()));
        System.out.println("Trojkat o bokach a = " + triangle1.getA() + ", b = " + triangle1.getB() + ", c = "
                + triangle1.getC() + " ma obwod = " + triangle1.calculateTrianglePerimeter(triangle1.getA(),
                triangle1.getB(), triangle1.getC()));
    }
}
