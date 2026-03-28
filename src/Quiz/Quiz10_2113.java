package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10_2113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 1; i <=input; i++) {

            // 공백
            for (int j = 1; j <=input-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1 ; k <=i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}


