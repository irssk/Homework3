package app.obstacles;

import app.participants.Participant;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(length);
    }

    @Override
    public String getDescription() {
        return "Treadmill[length=" + length + " meters]";
    }
}