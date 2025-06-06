package parrot;

public class NorwegianBlueParrotBehavior implements ParrotBehavior {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrotBehavior(ParrotStatus status) {
        this.voltage = status.getVoltage();
        this.isNailed = status.isNailed();
    }

    @Override
    public double getSpeed() {
        return isNailed ? 0.0 : Math.min(24.0, voltage * 12.0);
    }

    @Override
    public String getCry() {
        return "Bzzzzzz";
    }
}
