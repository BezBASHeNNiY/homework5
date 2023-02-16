package ua.ithillel.part1.figure;

public class Square implements Figure{

    private double side;
    public double area;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        area = Math.pow(this.side, 2);
        return area;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return area;
    }
}
