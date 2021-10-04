package ch06;

import java.util.Locale;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);


        changeSt(str);
        System.out.println(str.toLowerCase());

    }
    public static void changeSt(String str){
        str = "안녕";
    }

}
