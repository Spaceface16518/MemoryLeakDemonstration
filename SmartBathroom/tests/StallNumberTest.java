import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StallNumberTest {
    @Test
    @DisplayName("Equality test")
    void EqualityTest() {
        assertEquals(new StallNumber(0), new StallNumber(0));
    }

    @Test
    @DisplayName("NonEquality test")
    void NonEqualityTest() {
        assertNotEquals(new StallNumber(0), new StallNumber(1));
    }
}
