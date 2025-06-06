package parrot;

public class Parrot {

    private final ParrotBehavior behavior;

    public Parrot(ParrotTypeEnum type, ParrotStatus status) {
        this.behavior = ParrotBehaviorFactory.createBehavior(type, status);
    }

    public double getSpeed() {
        return behavior.getSpeed();
    }

    public String getCry() {
        return behavior.getCry();
    }
}
