package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayEx8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        for (int i=1; i<=9; i++){
            for (int j=1; j<=9; j++){

                arr[i-1][j-1] = i*j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length-1; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print(arr[i][8]+"]");
            System.out.println();
        }


    }
}
