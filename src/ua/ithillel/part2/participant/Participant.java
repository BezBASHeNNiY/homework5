package ua.ithillel.part2.participant;

import ua.ithillel.part2.obstacle.Obstacle;

public interface Participant {

    boolean overcome(Obstacle obs, int count);
    String className();
}
