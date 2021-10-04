package ch06;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifierEx pc = new AccessModifierEx();
//        pc.val = 10; -> 불가능(private)
        pc.defaultVal = 10; // ->가능(default)
    }
}
