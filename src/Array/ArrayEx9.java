package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayEx9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][4];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("학생" + (i+1) + "번호를 입력하세요.");
                int num = Integer.parseInt((br.readLine()));
                arr[i][j] = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            System.out.print("학생" + (i+1) + ":");
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + ",");
                c += arr[i][j];
            }
            System.out.print("평균:" + c / 4);
            System.out.println();
        }


    }
}
