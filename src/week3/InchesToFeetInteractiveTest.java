package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchesToFeetInteractiveTest {
    @Test void checkConvert() {
        InchesToFeet inchesToFeet = new InchesToFeet();
        inchesToFeet.convertAndPrintValues();
    }
}
