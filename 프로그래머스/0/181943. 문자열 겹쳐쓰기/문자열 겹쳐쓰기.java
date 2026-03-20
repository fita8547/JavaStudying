class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String front = my_string.substring(0, s);
        String back = my_string.substring(s + overwrite_string.length());
        
        return front + overwrite_string + back;
    }
}
/*자바의 substring()은 문자열(String 클래스)의 일부분을 추출하여 새로운 문자열을 만드는 메서드라고
라고 벨로그에서 찾아봄*/