package katatraining.wellofideas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void basicTests() {
        assertEquals("Fail!", Kata.well(new String[]{"bad", "bad", "bad"}));
        assertEquals("Publish!", Kata.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", Kata.well(new String[]{
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}