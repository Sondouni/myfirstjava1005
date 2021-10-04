package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        Computer.brand = "샘성";
//        Computer.cpu = 10; ->static이 아니라 안됨
        System.out.println("Computer.brand: "+Computer.brand);

        Computer c1 = new Computer();
        c1.cpu =10;
        System.out.println("c1.brand : "+c1.brand);
        System.out.println("c1.cpu : "+c1.cpu);

        Computer c2 = new Computer();
        c2.brand = "애플";
        c2.cpu =20;
        System.out.println("c2.brand : "+c2.brand);
        System.out.println("c2.cpu : "+c2.cpu);
        System.out.println("=======================");
        System.out.println("Computer.brand: "+Computer.brand);
        System.out.println("c1.brand : "+c1.brand);
        System.out.println("c1.cpu : "+c1.cpu);

        //static 변수/메소드는 객체생성해서 객체로 불러내지말고 클래스로 불러내는게 좋다
        c1.print();

    }}
