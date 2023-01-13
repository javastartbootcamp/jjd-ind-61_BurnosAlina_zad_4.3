package pl.javastart.task;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    double calculateCircleArea(double r) {
        return 3.13 * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
