package arrays;

public class rotate_matrix_by_90 {
    static void rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        // Transpose the matrix
        for(int i=0;i<n;i++) {
            for(int j=i;j<m;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // Reverse each row
        for(int i=0;i<n;i++) {
            for(int j=0;j<m/2;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateMatrix(matrix);

        System.out.println("Rotated Matrix by 90 degrees:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
