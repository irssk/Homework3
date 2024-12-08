package app;

import app.participants.Participant;
import app.participants.Human;
import app.participants.Cat;
import app.participants.Robot;
import app.obstacles.Obstacle;
import app.obstacles.Treadmill;
import app.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("John", 1000, 2),
                new Cat("Barsik", 500, 3),
                new Robot("R2D2", 2000, 1)
        };

        Obstacle[] obstacles = {
                new Treadmill(600),
                new Wall(2),
                new Treadmill(1200),
                new Wall(4)
        };

        for (Participant participant : participants) {
            boolean passedAll = true;

            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println(participant.getName() + " is out of the competition.");
                    passedAll = false;
                    break;
                }
            }

            if (passedAll) {
                System.out.println(participant.getName() + " successfully passed all obstacles!");
            }
        }
    }
}