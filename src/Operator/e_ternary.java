package Operator;
//삼항 연산자
public class e_ternary {
    public static void main(String[] args){
        int x=50;
        int y=60;
        System.out.println("최댓값은 " +max(x,y)+"입니다.");
    }

    //반환형(int) 함수이름(max) 매개변수(a,b)
    // 삼항 연산 부분에서 a>b보다 큰게 true이면 a를 반환하고 아니면 b를 반환한다.
   static int max(int a, int b){
        int result = (a>b)? a:b;
        return result;
    }
}
//메인메소드에서 함수를 사용하려면 static을 붙여줘야된다.
//static은 class전반적으로 사용되는 함수이다.