package final1;

public class CostantMain1 {
    public static void main(String[] args) {
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        

    }
    private static void process(int currentUserCount){
        System.out.println("참여자 수: "+currentUserCount);
        if(currentUserCount >1000){
            System.out.println("대기자로 등록합니다.");
        }else{
            System.out.println("게임에 참가합니다.");
        }
    }
}
