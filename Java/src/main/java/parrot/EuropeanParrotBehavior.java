package parrot;

public class EuropeanParrotBehavior implements ParrotBehavior {

    public EuropeanParrotBehavior(ParrotStatus status) {

    }

    @Override
    public double getSpeed() {
        return 12.0;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
