package app.participants;

public interface Participant {
    String getName();
    boolean run(int distance);
    boolean jump(int height);
}