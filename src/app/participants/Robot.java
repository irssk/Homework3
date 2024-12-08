package app.participants;

public class Robot implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " ran " + distance + " meters.");
            return true;
        } else {
            System.out.println(name + " failed to run " + distance + " meters.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " jumped " + height + " meters.");
            return true;
        } else {
            System.out.println(name + " failed to jump " + height + " meters.");
            return false;
        }
    }
}