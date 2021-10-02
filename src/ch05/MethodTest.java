package ch05;

public class MethodTest {
    public static void main(String[] args) {
        printMyself("황장군",17,180.82f,'A');
        int mon = (int)(Math.random()*12)+1;
        System.out.println(mon);
        printSeason(mon);
    }
    public static void printMyself(String str,int age, float height, char c){
        System.out.printf("%s의 키는 %.2f, 나이는 %d, 혈액형은 %c이다\n",str,height,age,c);
    }
    public static void printSeason(int mon){
//        switch (mon){
//            case 12,1,2:
//                System.out.println("겨울");
//                break;
//            case 3,4,5:
//                System.out.println("봄");
//                break;
//            case 6,7,8:
//                System.out.println("여름");
//                break;
//            case 9,10,11:
//                System.out.println("가을");
//                break;
//            default:
//                System.out.println("그런 달은 없습니다....");
        if(mon<3||mon==12){
            System.out.println("겨울");
        }else if(mon<12&&mon>8){
            System.out.println("가을");
        }else if(mon<9&&mon>5){
            System.out.println("여름");
        }else if(mon>2 &&mon<6){
            System.out.println("봄");
        }else{
            System.out.println("그런달은 없슴다");
        }
    }
}
