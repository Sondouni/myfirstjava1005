package ch02;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("---------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");

        String nm = "홍길동";
        int age = 92929299;
        float height = 180.8f;
        char bloodType  = 'A';
        System.out.println(nm + "의 키는" + height + ", 나이는 "+ age+ ", 혈액형 타입은"+ bloodType);
        System.out.printf("%s의 키는 %.1f, 나이는 %,d세, 혈액형 타입은 %c이다.",nm,height,age,bloodType);

    }
}
