package ua.ithillel.part2;

import ua.ithillel.part2.obstacle.Obstacle;
import ua.ithillel.part2.obstacle.Track;
import ua.ithillel.part2.obstacle.Wall;
import ua.ithillel.part2.participant.Cat;
import ua.ithillel.part2.participant.Human;
import ua.ithillel.part2.participant.Participant;
import ua.ithillel.part2.participant.Robot;

public class Obstacle_Test {

    private static Participant[] participants = new Participant[3];
    private static Obstacle[] obstacles = new Obstacle[4];

    public static void main(String[] args) {

        //create list of obstacles
        obstacles[0] = new Track(100);
        obstacles[1] = new Wall(1.2);
        obstacles[2] = new Track(500);
        obstacles[3] = new Wall(1.5);

        //create list of participants
        participants[0] = new Human();
        participants[1] = new Cat();
        participants[2] = new Robot();

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!participants[i].overcome(obstacles[j], j)) {
                    System.out.println(" Пройдено: " + j);
                    break;
                }
            }
        }
    }
}
