package variable;

public class f_TypeConversion {
    public static void main(String[] args) {
        int a = (int) 0.5;  //실수형이 정수형자료형으로 주어지면 소수점 자리는 제거된다
        System.out.println(a);

        double b=0.5;
        int c=(int)(b+0.5);
        System.out.println(c);
    }
}
