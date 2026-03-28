package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz9_2113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {

            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = input - i; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


