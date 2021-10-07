package exam211007;
/*
- 클래스명: Question2

- [3점] 입력한 값이 3~5이면 “봄” 출력

- [3점] 입력한 값이 6~8이면 “여름” 출력

- [3점] 입력한 값이 9~11이면 “가을” 출력

- [3점] 입력한 값이 12, 1, 2이면 “겨울” 출력

- [3점] 이외의 정수가 입력되면 “잘 못 입력” 출력

- [4점] switch문으로 처리
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘 못 입력");

        }
    }
}
