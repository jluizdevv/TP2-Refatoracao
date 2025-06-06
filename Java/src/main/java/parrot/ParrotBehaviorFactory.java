package parrot;

public class ParrotBehaviorFactory {
    public static ParrotBehavior createBehavior(ParrotTypeEnum type, ParrotStatus status) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrotBehavior(status);
            case AFRICAN -> new AfricanParrotBehavior(status);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrotBehavior(status);
        };
    }
}
