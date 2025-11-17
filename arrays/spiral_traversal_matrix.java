package arrays;
import java.util.*;

public class spiral_traversal_matrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res= new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0, bottom=n-1, left=0, right=m-1;
        while(top<=bottom && left<=right) {
            // Traverse from left to right
            for(int i=left;i<=right;i++) {
                res.add(matrix[top][i]);
            }
            top++;
            // Traverse from top to bottom
            for(int i=top;i<=bottom;i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
                // Traverse from right to left
                for(int i=right;i>=left;i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                // Traverse from bottom to top
                for(int i=bottom;i>=top;i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    } 

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Traversal of the Matrix:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
