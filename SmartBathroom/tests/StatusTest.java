import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StatusTest {
    @Test
    @DisplayName("Equality test for InUse")
    void InUseEqualityTest() {
        assertEquals(Status.InUse, Status.InUse);
    }

    @Test
    @DisplayName("Equality test for Empty")
    void EmptyEqualityTest() {
        assertEquals(Status.Empty, Status.Empty);
    }

    @Test
    @DisplayName("NonEqualityTest test")
    void NonEqualityTestTest() {
        assertNotEquals(Status.Empty, Status.InUse);
    }
}
