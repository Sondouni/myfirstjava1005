package ch06;
//class와 파일이름이 같아야지만 class 앞에 public을 적는게 가능
public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;
        Box box = new Box();
        box.val=10;

        System.out.println("val : "+val);
        changeVal(val);
        System.out.println("val : "+val);
        System.out.println("----------------");
        System.out.println("box.val : "+box.val);
        changeVal(box);
        System.out.println("box.val : "+box.val);
    }
    public static void changeVal(int val){
        val = 30;
    }
    public static void changeVal(Box b){
        b.val = 30;
    }
}
class Box{
    int val;
}