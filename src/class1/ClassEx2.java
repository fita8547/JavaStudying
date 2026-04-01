package class1;


public class ClassEx2 {
    public static void main(String[] args) {

        String[] title = {"인터스텔", "어바웃 타임", "기생충"};
        String[] review = {"인생은 무한 루프", "인생 시간 영화", "명작"};

        for(int i = 0; i < 3; i++) {
            System.out.println("영화 제목: " + title[i] + " 리뷰: " + review[i]);
        }
    }
}

