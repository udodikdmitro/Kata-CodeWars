package katatraining.pascaldiagonals;

public class PascalDiagonals {

    public static long[] generateDiagonal(int n, int l) {

        // Return an empty array if l = 0.
        if(l == 0){
            return new long[0];
        }

        // A length of the triangle's side:
        int sizeTriangle = n + l;

        // Create a Pascal's triangle that has nth diagonals with length l.
        // The first 3 elements of a triangle are 1.
        long[][] triangle = new long[sizeTriangle][sizeTriangle];
        triangle[0][0] = 1;
        triangle[1][0] = 1;
        triangle[1][1] = 1;

        for (int i = 2; i < sizeTriangle; i++){
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++){
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        //Create an array that has elements of the triangle's diagonal.
        long[] diagonal = new long[l];

        for (int i = 0; i < l; i++) {
            diagonal[i] = triangle[n + i][i];
        }
        return diagonal;
    }
}