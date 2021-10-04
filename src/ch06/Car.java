package ch06;
/*
    2가지로 구성
    - 멤버필드(변수, 상수)
    - 메소드method
 */

public class Car {
    String nm;
    String brand;

    //기본생성자constructor
    //1.클래스명과 같다
    //2.returnType이 없어야한다
    //*생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다
    Car(){

    }
    Car(String brand,String nm){
        this.brand = brand;
        this.nm = nm;
    }

    public void drive(){
        System.out.printf("%s의 %s가 달린다.\n",brand,nm);
    }
    public void stop(){
        System.out.printf("%s의 %s가 멈춘다.\n",brand,nm);
    }
}
