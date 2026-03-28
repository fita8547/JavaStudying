package Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Quiz2_2113 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요.");
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(a + b);
    }
}
