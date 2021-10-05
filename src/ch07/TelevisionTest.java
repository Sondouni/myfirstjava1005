package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.volumeState();
        for(int i = 0;i<11;i++){
            tv.volumeUp();
        }
        tv.volumeState();
        for(int i = 0;i<11;i++){
            tv.volumeDown();
        }
        tv.volumeState();

    }
}
