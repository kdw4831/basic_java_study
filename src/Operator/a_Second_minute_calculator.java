package Operator;
// 천초를 분초로 환산하기
public class a_Second_minute_calculator {
    final static int SECOND=1000; // 상수
    public static void main(String[] args){

        int minute= SECOND/60;
        int second= SECOND/60;

        System.out.println(minute+"분"+second+"초");
    }
}
