package others;
import java.util.*;
public class Server1 {
    Scanner sc = new Scanner(System.in);
    String sv[] = {"루나","서버2","서버3"};
    String yourSv;
    Server1(){

    }
    public String pickSv(){
        System.out.println("서버를 선택하세요");
        System.out.printf("1.%s,2.%s,3.%s",sv[0],sv[1],sv[2]);
        int svPut = sc.nextInt();
        this.yourSv=sv[0];
        return yourSv;
    }
}
