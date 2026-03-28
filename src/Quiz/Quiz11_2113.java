package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11_2113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int c=0;
        int[] arr1 = {1, 3, 5, 7,9};
        for (int i = 0; i <3; i++) {
            for (int k = 0 ; k <3; k++) {
                System.out.print(arr1[c]);
                c+=1;
                if (c>=5){
                    c=0;
                }
            }
            System.out.println("");
        }
    }
}


