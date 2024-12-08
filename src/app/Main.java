package app;

import app.participants.*;
import app.obstacles.*;
import app.shapes.*;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("John", 1000, 2, 1500),
                new Cat("Barsik", 500, 3, 1000),
                new Robot("R2D2", 2000, 1, 3000)
        };

        Obstacle[] obstacles = {
                new Treadmill(600),
                new Wall(2),
                new Treadmill(1200),
                new Wall(4)
        };

        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(6, 3)
        };

        System.out.println("Shapes and their areas:");
        for (Shape shape : shapes) {
            System.out.println(shape + " - Area: " + shape.getArea());
        }

        for (Participant participant : participants) {
            System.out.println("Participant: " + participant.getName());
            boolean passedAll = true;

            for (Obstacle obstacle : obstacles) {
                System.out.println("Attempting obstacle: " + obstacle.getDescription());
                if (!obstacle.overcome(participant)) {
                    System.out.println(participant.getName() + " failed to overcome " + obstacle.getDescription());
                    passedAll = false;
                    break;
                }
                System.out.println(participant.getName() + " successfully overcame " + obstacle.getDescription());
            }

            if (passedAll) {
                System.out.println(participant.getName() + " successfully passed all obstacles!\n");
            } else {
                System.out.println(participant.getName() + " is out of the competition.\n");
            }
        }
    }
}