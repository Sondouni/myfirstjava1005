package ch02;

public class VariableTest {
    public static void main(String[] args){
        /*
        1.정수는 실수를 저장할순 없다.
        2.작은타입에서 큰다입으로는 자동형변환이 이루어진다.(수동 가능)
        3.큰다입에서 작은타입으로는 자동형변환이 안된다.(수동으로 해야함)
         */
        int n1 = 10;
        int n2 = 3;
        double result = (double)n1/(double)n2;
        System.out.println("결과 : "+result);
    }
}
