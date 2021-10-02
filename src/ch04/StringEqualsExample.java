package ch04;

public class StringEqualsExample {
    public static void main(String[] args){
        //문자열 비교할때, ==비교 안됨! equals 를 써야함

        String str1 = "안녕하세요";
        String str2 = "안녕하세요";
        // String str1 = new String(original : "안녕하세요"); -> 실제 String클래스
        System.out.println(str1.equals(str2));
    }
}
