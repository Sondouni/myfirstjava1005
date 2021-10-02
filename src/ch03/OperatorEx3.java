package ch03;

public class OperatorEx3 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2;
        boolean result2 = n3 > n4;
        boolean result3 = n1 >= n2;
        boolean result4= n1 >= n2;
        System.out.println(result1 && result2);
        System.out.println(result1 || result2);

        System.out.println(true && true && true && false && true);
    }
}
