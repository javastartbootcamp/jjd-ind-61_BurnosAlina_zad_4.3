package pl.javastart.task;

public class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return square.a * square.a;
    }

    double calculateCircleArea(Circle circle) {
        return 3.13 * circle.r * circle.r;
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.a) + (2 * rectangle.b);
    }
}
