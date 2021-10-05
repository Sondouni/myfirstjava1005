package ch07;


public class DmbCellPhone extends CellPhone {
    int channel;
    public DmbCellPhone(){
        this("Iphone","white",12312);
    }
    public DmbCellPhone(String model,String color,int channel){
//        this("애플","white",132133);
        super(model,color);//super();> 부모에 기본생성자가 있을때
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    void turnOnDmb(){
        System.out.println("dmb 전원을 켭니다");
    }
    void turnOffDmb(){
        System.out.println("dmb 전원을 끕니다");
    }
    void changeChannel(int num){
        this.channel = num;
    }
    @Override
    void printInfo(){
        System.out.printf("model : %s, color : %s, channel : %d\n",model,color,channel);
//        super.printInfo(); System.out.printf("channel : %d\n",channel);
//        이것도 가능하다
    }


    /*
    public DmbCellPhone(){}
    public DmbCellPhone(int channel) {
        this.channel = channel;
    }
    기본생성자를 만들거나, 객체를 만들때 값을 넣어줘야함
     */

    /*
    this = 나 자신의 주소값 (현재 class)
    super = (직속)부모의 주소값(부모 class)
     */
}
