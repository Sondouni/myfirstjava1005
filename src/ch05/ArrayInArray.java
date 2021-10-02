package ch05;

public class ArrayInArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        System.out.println(arr.length);      //2
        System.out.println(arr[0].length);   //3
        System.out.println(arr[1].length);   //3
        //다차원배열에서 첫번째 배열값이 전체 길이 arr.length
        //            각 배열의 길이값이 arr[i]의 길이
        for(int i = 0;i<arr.length;i++){
            for(int z = 0;z<arr[i].length;z++){
                System.out.printf("(%d,%d): %d\t", i,z,arr[i][z]);
            }
            System.out.println();
        }
        System.out.println(arr.toString());
    }
}
