package arrays;
import java.util.*;
public class pascal_triangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
            for(int j=1;j<i;j++) {
                row.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }

    static List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    int leftParent = triangle.get(row - 1).get(col - 1);
                    int rightParent = triangle.get(row - 1).get(col);
                    currentRow.add(leftParent + rightParent);
                }
            }
            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
