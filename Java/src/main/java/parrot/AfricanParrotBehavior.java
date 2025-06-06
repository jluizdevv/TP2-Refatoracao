package parrot;

public class AfricanParrotBehavior implements ParrotBehavior {
    private final int numberOfCoconuts;

    public AfricanParrotBehavior(ParrotStatus status) {
        this.numberOfCoconuts = status.getNumberOfCoconuts();
    }

    @Override
    public double getSpeed() {
        return Math.max(0.0, 12.0 - 3.0 * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
