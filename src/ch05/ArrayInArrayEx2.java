package ch05;

public class ArrayInArrayEx2 {
    public static void main(String[] args) {
        int[][]arr =
                {
                        {0,0,0,0},
                        {0,0,0},
                        {0,0,10,0}
                };
        System.out.println(arr.length);      //2
        System.out.println(arr[0].length);   //3
        System.out.println(arr[1].length);   //3
        for(int i = 0;i<arr.length;i++){
            for(int z = 0;z<arr[i].length;z++){
                System.out.printf("(%d,%d): %d\t", i,z,arr[i][z]);
            }
            System.out.println();
        }
    }
}
