package Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScannerEx7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수를 입력하세요: ");
        int a = Integer.parseInt((br.readLine()));

        if (a%2 == 0 ) {
            System.out.println("입력한 숫자 "+a+"짝수입니다.");
        } else {
            System.out.println("입력한 숫자 "+a+"홀수입니다.");
        }


    }
}
