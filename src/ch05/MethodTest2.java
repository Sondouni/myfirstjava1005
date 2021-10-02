package ch05;

public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(10);
        System.out.println("홀짝 : "+oddEven);
    }
    public static String getOddEven(int num){
        if(num%2==1){
            return "홀";
        }else{
            return "짝";
        }

    }
}
