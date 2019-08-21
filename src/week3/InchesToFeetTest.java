package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchesToFeetTest {
    @Test void checkConvert() {
        InchesToFeet inchestofeet = new InchesToFeet();
        inchestofeet.convertAndPrintValues();
    }
}
