package kata;

public class SomeMatrix22 {
    public static int countDifferentMatrices(int[][] matrices) {
        int matricesCount = 1;
        int countSteps = 0;

        for (int i = 0; i < matrices.length; i++) {
            if (matrices[i] == null) {continue;}

            for (int j = i + 1; j < matrices.length; j++) {
                if (matrices[j] == null) {continue;}
                if ((matrices[i][0] == matrices[j][0] &&
                        matrices[i][1] == matrices[j][1] &&
                        matrices[i][2] == matrices[j][2] &&
                        matrices[i][3] == matrices[j][3]) ||
                        (matrices[i][0] == matrices[j][1] &&
                        matrices[i][1] == matrices[j][3] &&
                        matrices[i][2] == matrices[j][0] &&
                        matrices[i][3] == matrices[j][2]) ||
                        (matrices[i][0] == matrices[j][3] &&
                        matrices[i][1] == matrices[j][2] &&
                        matrices[i][2] == matrices[j][1] &&
                        matrices[i][3] == matrices[j][0]) ||
                        (matrices[i][0] == matrices[j][2] &&
                        matrices[i][1] == matrices[j][0] &&
                        matrices[i][2] == matrices[j][3] &&
                        matrices[i][3] == matrices[j][1])) {
                    matrices[j] = null;
                    if (countSteps > 0) {matricesCount--;}
                } else {
                    matricesCount++;
                }
            }
            matrices[i] = null;
            countSteps++;
        }
        return matricesCount;
    }

    public static void main(String[] args) {
        int [][] ms = new int[][] {{1, 2, 2, 1},
                {1, 1, 2, 2},
                {2, 1, 1, 2},
                {2, 1, 2, 1},
                {1, 2, 1, 2}};
        System.out.println(SomeMatrix22.count_different_matrices(ms));
    }
}