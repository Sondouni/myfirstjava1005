package ch05;

public class ArrayCopy {
    public static void main(String[] args) {
        //배열의 특징, 레퍼런스 변수의 특징
        int[]arr1 = {10,20,30};
        int[]arr2 = arr1; //얕은복사 shallow copy
        System.out.println("arr1[0] : "+arr1[0]);
        System.out.println("arr1[0] : "+arr2[0]);
        arr2[0]=5;
        System.out.println("arr1[0] : "+arr1[0]);
        System.out.println("arr2[0] : "+arr2[0]);
        System.out.println(arr1==arr2);
        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
