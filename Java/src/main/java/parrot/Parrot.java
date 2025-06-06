package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final ParrotStatus status;

    // Construtor novo que recebe ParrotStatus
    public Parrot(ParrotTypeEnum type, ParrotStatus status) {
        this.type = type;
        this.status = status;
    }

    // Construtor antigo para compatibilidade com testes antigos
    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean nailed) {
        this.type = type;
        this.status = new ParrotStatus(numberOfCoconuts, voltage, nailed);
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * status.getNumberOfCoconuts());
            case NORWEGIAN_BLUE -> status.isNailed() ? 0 : calculateSpeedBasedOnVoltage();
            default -> throw new IllegalArgumentException("Unknown parrot type");
        };
    }

    private double calculateSpeedBasedOnVoltage() {
        return Math.min(24.0, status.getVoltage() * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> status.getVoltage() > 0 ? "Bzzzzzz" : "...";
            default -> throw new IllegalArgumentException("Unknown parrot type");
        };
    }
}
