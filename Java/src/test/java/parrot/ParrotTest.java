package parrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTest {

    // ----------- TESTES ANTIGOS (construtor com muitos parâmetros) -----------

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getCryOfEuropeanParrot() {
        Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals("Sqoork!", parrot.getCry());
    }

    @Test
    public void getCryOfAfricanParrot() {
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals("Sqaark!", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueHighVoltage() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals("Bzzzzzz", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueNoVoltage() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, false);
        assertEquals("...", parrot.getCry());
    }


    // ----------- TESTES NOVOS (usando ParrotStatus) -----------

    @Test
    public void getSpeedOfEuropeanParrot_WithParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, status);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(1, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, status);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(2, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, status);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, status);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 1.5, true);
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, status);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 1.5, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, status);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 4, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, status);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getCryOfEuropeanParrot_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, status);
        assertEquals("Sqoork!", parrot.getCry());
    }

    @Test
    public void getCryOfAfricanParrot_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(1, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, status);
        assertEquals("Sqaark!", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueHighVoltage_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 4, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, status);
        assertEquals("Bzzzzzz", parrot.getCry());
    }

    @Test
    public void getCryOfNorwegianBlueNoVoltage_UsingParrotStatus() {
        ParrotStatus status = new ParrotStatus(0, 0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, status);
        assertEquals("...", parrot.getCry());
    }
}
