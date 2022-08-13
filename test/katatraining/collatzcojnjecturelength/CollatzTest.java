package katatraining.collatzcojnjecturelength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CollatzTest {

    @Test
    public void testSomething() {
        assertEquals(26L, Collatz.conjecture(100L), "Test failed for: " + 100L);
        assertEquals(88L, Collatz.conjecture(103L), "Test failed for: " + 103L);
        assertEquals(0L, Collatz.conjecture(0L), "Test failed for: " + 0L);
        assertEquals(7L, Collatz.conjecture(10L), "Test failed for: " + 10L);
        assertEquals(111L, Collatz.conjecture(500L), "Test failed for: " + 500L);
        assertEquals(101L, Collatz.conjecture(1000000000L), "Test failed for: " + 1000000000L);
        assertEquals(276L, Collatz.conjecture(1000000000000000L), "Test failed for: " + 1000000000000000L);
    }

}