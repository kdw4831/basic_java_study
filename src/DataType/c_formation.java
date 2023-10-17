package DataType;

public class c_formation {
    public static void main(String[] args){
        int a=200;
        System.out.println("10진수:" + a);
        System.out.format("8진수: %o\n", a);
        // %o는 형식지정자라고 한다. 기능은 10진수를 8진수로 변환해준다.
        System.out.format("16진수: %x ", a);

        //println은 \n(줄바꿈)이 자동으로 적용되어있지만 format같은 경우는 적용되어있지 않다
    }
}
