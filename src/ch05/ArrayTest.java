package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int [] scores = {100,87,56,23,28,98,30,32};
        int sum=0;
        for(int i = 0; i<scores.length;i++){
            if(scores[i]%2 == 0){
                System.out.print(scores[i]+", ");
            }else{
                sum += scores[i];
            }
        }
        System.out.println();
        System.out.println("홀수 총합: "+sum);
    }
}
