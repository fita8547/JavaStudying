package Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Quiz3_2113 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.print("숫자를 입력하세요.");
            int input = Integer.parseInt(br.readLine());
            if (input >80){
                System.out.println("합격입니다.");
            } else if (input<=79 && input>=0) {
                System.out.println("불합격입니다.");
            }else{
                break;
            }
        }
    }
}
