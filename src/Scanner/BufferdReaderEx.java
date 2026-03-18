package Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferdReaderEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("뮨자열을 입력하세요: ");
        String str = br.readLine();
        System.out.print("정수를 입력하세요: ");
        int intValue = Integer.parseInt((br.readLine()));
        System.out.println("입력한 정수: "+intValue);

        System.out.print("실수를 입력하세요: ");
        double dobleValue = Double.parseDouble(br.readLine());
        System.out.println("입력힌 실수: "+dobleValue);
    }
}
