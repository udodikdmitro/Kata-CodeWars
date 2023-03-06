package katatraining.pascaldiagonals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class PascalDiagonalsTest {

    @Test
    void generateDiagonal() {
        long[] expected = new long[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertArrayEquals("All the ones", expected, PascalDiagonals.generateDiagonal(0, 10));

        expected = new long[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertArrayEquals("Natural numbers", expected, PascalDiagonals.generateDiagonal(1, 10));

        expected = new long[] { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55 };
        assertArrayEquals("Triangular numbers", expected, PascalDiagonals.generateDiagonal(2, 10));

        expected = new long[] { 1, 4, 10, 20, 35, 56, 84, 120, 165, 220 };
        assertArrayEquals("Tetrahedral numbers", expected, PascalDiagonals.generateDiagonal(3, 10));

        expected = new long[] { 1, 5, 15, 35, 70, 126, 210, 330, 495, 715 };
        assertArrayEquals("Pentatope numbers", expected, PascalDiagonals.generateDiagonal(4, 10));
    }
}