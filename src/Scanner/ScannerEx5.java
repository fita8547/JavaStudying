package Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScannerEx5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        while (true) {
            System.out.print("정수를 입력하세요: ");
            int a = Integer.parseInt((br.readLine()));

            if (a == 0 ) {
                System.out.println(c);
                break;

            } else {
                c+=a;
            }

        }
    }
}
