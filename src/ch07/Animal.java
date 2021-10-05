package ch07;

public abstract class Animal {
    public void crying() {
        System.out.println("동물이 울다");
    }
        //    public void eat(){} : 무의미한 {}라서 추상메서드를 사용

    public abstract void eat();
//    public void eat(){} : 무의미한 {}라서 추상메서드를 사용
    /*
    abstract class
    구현방법 : abstract class ____{}
    추상클래스는 객체화가 불가능하다
    추상메소드가 클래스에 1개라도 존재하면 그 클래스는 추상클래스가 되어야 한다.
        -> 추상클래스에 추상메소드가 없어도 되지만 추상 메소드는 일반 클래스에서는 구현불가
    추상메소드는 강제성이 있다. ☆★☆★☆★자식은 추상메소드를 꼭 구현해야한다★☆★☆★☆
     */
}
