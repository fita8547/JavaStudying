import java.util.Scanner;

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        Solution sol = new Solution();
        System.out.println(sol.solution(str1, str2));
    }
}