package ua.ithillel.part1;

import ua.ithillel.part1.figure.Circle;
import ua.ithillel.part1.figure.Figure;
import ua.ithillel.part1.figure.Square;
import ua.ithillel.part1.figure.Triangle;

public class Figure_Test {

    static double area = 0;

    static Figure[] figures = new Figure[5];

    public static void main(String[] args) {
        figures[0] = new Square(9);
        figures[1] = new Triangle(3);
        figures[2] = new Circle(15.25);
        figures[3] = new Triangle(0.75);
        figures[4] = new Square(12.5);


        System.out.println(listArea(figures));
    }

    static double listArea(Object[] List) {
        for (int i = 0; i < List.length; i++) {
            area += figures[i].area();
        }
        return area;
    }

}