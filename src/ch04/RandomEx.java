package ch04;

public class RandomEx {
    public static void main(String[] args){
        int num = (int)(Math.random()*6);

        //값의 범위  : 0.0~0.999999999999999 절대 1은 안나옴
        //*6을 했을시에 5.4999991239129841093473287498327982이렇게 나오는데,
        //형변환시 5, 최솟값이 0이 되므로 0~`5까지 됨
        System.out.println("num : "+num);
        //2~7사이
        int num2 = (int)(Math.random()*6+2);
        System.out.println("num2 : "+num2);
        //55~108
        int num3 = (int)(Math.random()*54+55);
        System.out.println("num3 : "+num3);
        //랜덤 클래스보다 메소드가 빠르고 메모리를 자주쓴다

    }
}
