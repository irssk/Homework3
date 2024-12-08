package app.obstacles;

import app.participants.Participant;

public interface Obstacle {
    boolean overcome(Participant participant);
}