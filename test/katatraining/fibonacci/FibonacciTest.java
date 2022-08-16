package katatraining.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sampleTests() {
        assertEquals(0, Fibonacci.fib(0), "fib(1)");
        assertEquals(1, Fibonacci.fib(1), "fib(1)");
        assertEquals(1, Fibonacci.fib(2), "fib(2)");
        assertEquals(2, Fibonacci.fib(3), "fib(3)");
        assertEquals(3, Fibonacci.fib(4), "fib(4)");
        assertEquals(5, Fibonacci.fib(5), "fib(5)");
    }
}