package ua.ithillel.part1.figure;

public class Circle implements Figure{

    private double radius;
    public double area;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double area() {
        area = 3.14 * Math.pow(this.radius, 2);
        return area;
    }

    public double getRadius() { return radius; }

    public double getArea() { return area; }
}
