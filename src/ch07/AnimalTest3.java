package ch07;

public class AnimalTest3 {
    public static void main(String[] args) {
        Animal ani = new Cat(); // Animal이 추상클래스지만, Animal타입으로 Cat을 객체화할수는 있다.
        ani.eat();

    }
}
