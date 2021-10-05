package ch07;

public class Television implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }
    @Override
    public void volumeUp() {
        if(this.volume<MAX_VOLUME){
            volume++;
        }else{
            System.out.println("최대볼륨입니다");
        }
    }
    @Override
    public void volumeDown() {
        if(this.volume>MIN_VOLUME){
            volume--;
        }else{
            System.out.println("최소볼륨입니다");
        }
    }

    public void volumeState(){
        System.out.println("volume : "+this.volume);
    }
}
