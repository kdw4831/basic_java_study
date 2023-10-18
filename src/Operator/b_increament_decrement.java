package Operator;

public class b_increament_decrement {
    public static void main(String[] args){

        int a=10;
        System.out.println("현재의 a는" +a+"입니다");
        a++;
        System.out.println("현재의 a는" +a+"입니다");
        System.out.println("현재의 a는"+  ++a +"입니다"); //++가 앞에 붙어있으면 바로 출력
        System.out.println("현재의 a는"+  a++ +"입니다"); //즉 여기까진 12였다가 다음번이 13인 것 함 확인 드가자
    }

}
