package Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScannerEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수를 입력하세요: ");
        int a= Integer.parseInt((br.readLine()));
        int b= Integer.parseInt((br.readLine()));
        int c= Integer.parseInt((br.readLine()));
        System.out.println(a+b+c);
    }
}
