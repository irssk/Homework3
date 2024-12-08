package app.obstacles;

import app.participants.Participant;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height);
    }

    @Override
    public String getDescription() {
        return "Wall[height=" + height + " meters]";
    }
}