package ch02;

public class StringExample {
    public static void main(String[] args){
        String str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str1 + " 그래요~" +str1 );
        str1 = str1 +13;
        System.out.println(str1);
        int i = 10;
        String str2 = i + "10" + 10;
        System.out.println(str2);
    }
}
