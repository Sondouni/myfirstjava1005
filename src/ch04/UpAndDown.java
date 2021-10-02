package ch04;

import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100)+1;
        int pickNum=0;
        String hint = (num-10)+"~"+(num+10);
        while(true){
            System.out.println("숫자를 입력하시오");
            pickNum = sc.nextInt();
            if(pickNum>num){
                System.out.println("Down");
            }else if(pickNum<num){
                System.out.println("Up");
            }else {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
