package variable;

public class c_Constant {
    // final은 한번 선언되면 절대 바뀔 수 없다는 상수라는 의미를 가지고 있다.
    //static이라는 것은 하나의 클래스에서 공유하는 어떠한 자원을 말한다.
    final static  double PI=3.141592;
    public static void main(String[] args){
        int r=30;
        System.out.println(r*r*PI);

    }
}
