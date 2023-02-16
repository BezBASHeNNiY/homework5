package ua.ithillel.part2.obstacle;

public class Track implements Obstacle{

    private double length;

    public Track(double l) { this.length = l; }

    @Override
    public double size() { return this.length; }

    @Override
    public String className() {
        return "Track";
    }
}
