package ch07;

public class CellPhone {
    //CellPhone : 부모클래스
    String model;
    String color;
    public CellPhone(){
//        super(); -> 다른 생성자에서 벌써 super를 호출하고있기때문에 하면 안됨
        this("노트10","white");
    }
    public CellPhone(String model,String color){
        this.model = model;
        this.color = color;
    }
    void powerOn(){
        System.out.println("전원을 켭니다");
    }
    void powerOff(){
        System.out.println("전원을 끕니다");
    }
    void printInfo(){
        System.out.printf("model : %s, color : %s\n",model,color);
    }
    void sendMsg(String msg){
        System.out.println("보낸 메세지 : "+msg);
    }
}