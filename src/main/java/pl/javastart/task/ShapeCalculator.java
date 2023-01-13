package pl.javastart.task;

public class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return square.getA() * square.getA();
    }

    double calculateCircleArea(Circle circle) {
        return 3.13 * circle.getR() * circle.getR();
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.getA()) + (2 * rectangle.getB());
    }
}
