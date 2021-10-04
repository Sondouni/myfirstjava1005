package ch06;

public class Computer {
    static String brand;
    int cpu;

    public void print(){
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다",brand,cpu);
    }
    public static void print2(){
//        System.out.println("컴퓨터 브랜드는 %s이고, cpu는 %d입니다",brand,cpu);
//        static 메소드는 static 변수(필드)들만 사용가능하다
    }
}
