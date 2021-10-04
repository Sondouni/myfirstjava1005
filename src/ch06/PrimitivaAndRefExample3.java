package ch06;

public class PrimitivaAndRefExample3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.val = 3;

        Box box2 = new Box();
        box2.val = 5;

        System.out.println(box1.val);
        System.out.println(box2.val);
        PrimitiveAndRefExample.changeVal(box1);
        PrimitiveAndRefExample.changeVal(box2);
        System.out.println(box1.val);
        System.out.println(box2.val);
    }
}
