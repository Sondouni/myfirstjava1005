package ch02;

public class VariableExample3 {
    public static void main(String[] args){
        char c = 'B';
        System.out.printf("%c:%d\n",c,(int)c);

        int i = 69;
        System.out.printf("%c:%d\n",(char)i,i);

        boolean bl = true;
        System.out.println(bl);


    }
}
//char,boolean
//byte < char < short < int < long < float < double 원시타입들
//String은 짱짱셈 double이김
//reference 변수 String...등등 앞에 대문자로 나오고 메소드,배열인 친구들??