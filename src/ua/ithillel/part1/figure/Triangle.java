package ua.ithillel.part1.figure;

public class Triangle implements Figure{

    private double side;
    public double area;

    public Triangle(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        area = ( Math.sqrt(3) * Math.pow(this.side, 2) ) / 4;
        return area;
    }

    public double getSide() { return side; }

    public double getArea() { return area; }
}
