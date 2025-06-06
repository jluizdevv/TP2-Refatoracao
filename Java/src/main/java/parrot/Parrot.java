package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN -> {
                double baseSpeed = getBaseSpeed();
                return baseSpeed;
            }
            case AFRICAN -> {
                double baseSpeed = getBaseSpeed();
                double loadFactor = getLoadFactor();
                double coconutLoad = loadFactor * numberOfCoconuts;
                double speed = baseSpeed - coconutLoad;
                double minimumSpeed = 0;
                return Math.max(minimumSpeed, speed);
            }
            case NORWEGIAN_BLUE -> {
                if (isNailed) {
                    return 0;
                }
                double speedBasedOnVoltage = calculateSpeedBasedOnVoltage();
                return speedBasedOnVoltage;
            }
            default -> throw new IllegalArgumentException("Unknown parrot type");
        }
    }

    private double calculateSpeedBasedOnVoltage() {
        double baseSpeed = getBaseSpeed();
        double maxSpeed = 24.0;
        double speed = voltage * baseSpeed;
        return Math.min(maxSpeed, speed);
    }

    public String getCry() {
        switch (type) {
            case EUROPEAN -> {
                String cry = "Sqoork!";
                return cry;
            }
            case AFRICAN -> {
                String cry = "Sqaark!";
                return cry;
            }
            case NORWEGIAN_BLUE -> {
                boolean hasVoltage = voltage > 0;
                String cry = hasVoltage ? "Bzzzzzz" : "...";
                return cry;
            }
            default -> throw new IllegalArgumentException("Unknown parrot type");
        }
    }

