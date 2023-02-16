package ua.ithillel.part2.obstacle;

public class Wall implements Obstacle{

    private double height;

    public Wall(double h) { this.height = h; }

    @Override
    public double size() { return this.height; }

    @Override
    public String className() {
        return "Wall";
    }
}
