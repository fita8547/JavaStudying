package Quiz;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
    public class Quiz7_2113 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");

            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);

            for (int i = 1; i <= row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print((i + j) + " ");
                }
                System.out.println();
            }
        }
    }


