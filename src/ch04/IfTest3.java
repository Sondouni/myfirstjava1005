package ch04;

public class IfTest3 {
    public static void main(String[] args){
        //60~100점
        int score =(int)(Math.random()*41)+60;
        System.out.println(score);
        char grade = 'D';
        char pm = ' ';
        if(score>=90){
            grade = 'A';
        }else if(score>=80) {
            grade = 'B';
        }else if(score>=70) {
            grade = 'c';
        }
        if(score >70) {
            int mVal = score % 10;
            if (mVal >= 8 || score == 100) {
                pm = '+';
            } else if (mVal <= 3) {
                pm = '-';
            }
        }
        System.out.printf("%c%c",grade,pm);
        //나머지 (mod)를 잘 사용하자
    }
}
