package Quiz;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Quiz8_2113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

// a > b이면 swap
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >=a ; j--) {
                System.out.print(j + " * " + i + " = " + (j * i) + "   ");
            }
            System.out.println();
        }
    }
}


