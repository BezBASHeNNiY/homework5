package ua.ithillel.part2.participant;

import ua.ithillel.part2.obstacle.Obstacle;

public class Cat implements Participant{

    private double run_length = 250;
    private double jump_height = 2;

    @Override
    public boolean overcome(Obstacle obs, int count) {
        if (obs.className() == "Track"){
            if (this.run_length >= obs.size()) {
                System.out.println("Участник "+this.className()+" прошел препятствие "+obs.className()+" на дистанции "+ count);
                return true;
            }
            else {
                System.out.print("Участник "+this.className()+" не прошел препятствие "+obs.className()+" на дистанции "+ count);
                return false;
            }
        } else if (obs.className() == "Wall") {
            if (this.jump_height >= obs.size()) {
                System.out.println("Участник "+this.className()+" прошел препятствие "+obs.className()+" на дистанции "+ count);
                return true;
            }
            else {
                System.out.print("Участник "+this.className()+" не прошел препятствие "+obs.className()+" на дистанции "+ count);
                return false;
            }
        }

        return false;
    }

    @Override
    public String className(){
        return "Cat";
    }

}
