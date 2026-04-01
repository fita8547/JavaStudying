package class1;

public class Class1 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생2"};
        int[] studentsAges ={15,16};
        int[] studentGrades = {90,80};
        for (int i=0; i<studentNames.length; i++){
            System.out.println("이름: "+studentNames[i]+" 나이: "+studentsAges[i]+" 성적 "+ studentGrades[i]);
        }
    }
}
