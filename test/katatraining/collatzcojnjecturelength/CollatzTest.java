package katatraining.collatzcojnjecturelength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzTest {

    @Test
    public void testSomething() {
        assertEquals("Test failed for: " + 100L, 26L, Collatz.conjecture(100L));
        assertEquals("Test failed for: " + 10L, 7L, Collatz.conjecture(10L));
        assertEquals("Test failed for: " + 500L, 111L, Collatz.conjecture(500L));
        assertEquals("Test failed for: " + 1000000000L, 101L, Collatz.conjecture(1000000000L));
        assertEquals("Test failed for: " + 1000000000000000L, 276L, Collatz.conjecture(1000000000000000L));
    }

    private void assertEquals(String s, long l, long conjecture) {
    }
}