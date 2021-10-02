package ch02;

public class VariableExample2 {
    public static void main(String[] args){
        /*
           /*+enter
         */
        float f;//4byte
        double d;//8byte

        int n1;
//        n1 = 10.1; 안됨
        f = 10.1f; //이건 됨 근데 f해야함
        d = 10.1;

        double d2 = f*f;//자동형변환
        double d3 = (double)f*f;//반자동?ㅋㅋㅋㅋ
//        float f2 = d*d;//자동형변환 안해줌
          float f2 = (float)(d*d);//수동형변환 해줘야함
    }
}
