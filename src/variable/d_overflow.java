package variable;


public class d_overflow {
    //INT_MAX int형 자료형이 가질 수 있는 가장 큰 값
    final static int INT_MAX=2147483647;
    public static void main(String[] args){
        int a=INT_MAX;
        System.out.println(a);
        System.out.println(a+1); // 오버 플로우 때문에 생기는 문제

        // int 형의 경우 약-21억 부터 +21억까지의 크기를 가지기에 max에서 1이 더해진 것 만으로
        //가장 작은 숫자가 출력이됨


    }
}
