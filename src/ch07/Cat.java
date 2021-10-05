package ch07;

public class  Cat extends Animal{
    @Override
    public void crying() {
        System.out.println("고양이가 애옹애옹");
    }
    @Override
    public void eat() {
        System.out.println("우리집 고양인 츄르를 좋아해");
    }
}
//Cat을 추상화 시키면 부모인 Animal의 추상메서드인 eat을 구현안해도 된다.
//대신, BigCat에서 구현을 시켜줘야한다