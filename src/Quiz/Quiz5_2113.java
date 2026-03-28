package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz5_2113 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요.");
        int input = Integer.parseInt(br.readLine());
        for (int i = 2; i<=input; i++){
            if (i%2==0){
                System.out.print(i);

                System.out.print(" ");
            }
        }
    }
}


