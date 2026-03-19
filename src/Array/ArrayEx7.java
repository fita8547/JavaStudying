package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrayEx7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int[][] arr = new int[5][5];
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==2){
                    arr[j][i] = 1;
                }else{
                    arr[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length-1; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print(arr[i][4]+"]");
            System.out.println();
        }


    }
}
