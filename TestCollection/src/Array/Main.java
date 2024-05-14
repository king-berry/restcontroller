package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        int[] numbers = new int[2];
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        numbers[0] = 10;
        numbers[1] = 20;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]+ " ");
        }
        for (int i = 0; i < matrix.length; i++) {
            // Duyệt qua từng phần tử trong dòng hiện tại
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau khi in xong mỗi dòng
        }

    }
}

