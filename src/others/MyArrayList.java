package others;

import java.util.Arrays;

public class MyArrayList {
    private int[] arr;
    int arrNum=0;
    int arrVal=0;

    public MyArrayList(){
        arr = new int[0];
    }
    public void add(int val){
//        ++arrNum;
//        arr[arrVal] = val;
//        arrVal++;
//        int[] temp = new int[arr.length+1];
//        temp[arr.length] =val;
//        System.out.println(temp[arr.length]);
//        arr[arr.length]=temp[arrNum];
//        arrNum++;
        int[]temp = new int[arr.length+1];
        for(int i = 0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        temp[arr.length]=val;
        arr=temp;
//        System.out.println(Arrays.toString(arr));
        //깊은복사를 하는이유? -> 배열이 선언되면 배열크기를 변경할수 없다!!
    }
    public int remove(int val){
        int removeVal = arr[val];
        int count=0;
        int[]temp = new int[arr.length-1];
        for(int i =0;i<arr.length;i++){
           if(removeVal==arr[i]){
               continue;
           }else {
               temp[count++] = arr[i];
           }
        }
        arr = temp;
        return removeVal;
    }

    public int remove2(int idx) {
        int removeVal = arr[idx];
        int[] temp = new int[arr.length-1];
        for(int i=0; i<arr.length; i++) {
           temp[i] = i<idx ? arr[i] : arr[i + 1];

        }
        arr = temp;
        return removeVal;
    }
    public void print(){
        System.out.print("[");
        for(int i = 0;i<arr.length;i++){
//            if(i==arr.length-1){
//                System.out.printf("%d",arr[i]);
//                break;
//            }
            if(i!=0){
                System.out.print(", ");
            }
//            System.out.printf("%d, ",arr[i]);
            System.out.print(arr[i]);
        }
        System.out.println("]");
        System.out.println(Arrays.toString(arr));
    }

}
//removeVal만들어보기