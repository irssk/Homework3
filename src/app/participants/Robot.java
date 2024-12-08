package app.participants;

public class Robot implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int stamina;

    public Robot(String name, int maxRunDistance, int maxJumpHeight, int stamina) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.stamina = stamina;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance && stamina >= distance) {
            stamina -= distance;
            System.out.println(name + " ran " + distance + " meters. Remaining stamina: " + stamina);
            return true;
        } else {
            System.out.println(name + " failed to run " + distance + " meters. Remaining stamina: " + stamina);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight && stamina >= height * 10) {
            stamina -= height * 10;
            System.out.println(name + " jumped " + height + " meters. Remaining stamina: " + stamina);
            return true;
        } else {
            System.out.println(name + " failed to jump " + height + " meters. Remaining stamina: " + stamina);
            return false;
        }
    }
}