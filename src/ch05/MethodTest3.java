package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal=getRandom(30,40);//30~40사이
        System.out.println(rVal);
        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println("absVal: "+ absVal);
        System.out.println("absVal2: "+ absVal2);

    }
    public static int getRandom(int x,int y){
        return (int)(Math.random()*(y-x+1))+x;
    }
    public static int getABS(int x){
        return x<0?-x:x;
    }
}
