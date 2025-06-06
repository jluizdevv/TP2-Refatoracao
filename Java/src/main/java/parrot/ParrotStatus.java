package parrot;

public class ParrotStatus {
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean nailed;

    public ParrotStatus(int numberOfCoconuts, double voltage, boolean nailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.nailed = nailed;
    }

    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public double getVoltage() {
        return voltage;
    }

    public boolean isNailed() {
        return nailed;
    }
}
