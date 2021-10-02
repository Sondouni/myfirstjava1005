package ch05;

public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] arr1 ={ 10,20,30};
        int[] arr2 = new int[arr1.length];
        //deep copy 깊은복사

        System.out.println(arr1 == arr2);
        for(int i = 0;i<arr2.length;i++){
            arr2[i]=arr1[i];
        }
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println(arr1 == arr2);
    }
}
