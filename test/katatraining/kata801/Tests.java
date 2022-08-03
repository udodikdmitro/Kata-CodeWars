package katatraining.kata801;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {
    @Test
    void kata801() {
        Kata801 kata801 = new Kata801();
        assertEquals("56x^7", kata801.derive(7, 8));
    }
}
