package ch07;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10; // public        static      final이 언제나 붙음(생략가능)
    int MIN_VOLUME = 0;                      // (열려있고, 메모리에 올라가있고, 상수)

    public abstract void turnOn();           // public       abstract   가 언제나 붙음(생략 싸ㅃㅃㅃ가능)
    void turnOff();                          // (열려있고,       추상화)
    void volumeUp();
    void volumeDown();
}
/*
인터페이스는 객체화가 불가능 (부모역활, 타입으로만 할수있다)
 */
