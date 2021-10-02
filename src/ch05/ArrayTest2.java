package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 숫자를 사용할거에유? : \n");
        int LEN = sc.nextInt();
        int[] numberArr = new int[LEN];
        int sum = 0;
        System.out.printf("숫자 %d개를 입력해주세요\n",LEN);
        for(int i = 0;i<numberArr.length;i++){
            System.out.printf("숫자 %d : ",(i+1));
            numberArr[i]=sc.nextInt();
        }
        for(int i = 0;i<numberArr.length;i++){
            sum += numberArr[i];
        }
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+(float)sum/numberArr.length);
    }
}
