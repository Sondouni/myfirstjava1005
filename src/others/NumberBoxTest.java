package others;
//equals()
public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox bn1 = new NumberBox(1);
        NumberBox bn2 = new NumberBox(1);

        System.out.println(bn1 == bn2);
        System.out.println(bn1.equals(bn2));
        System.out.println(bn1.getVal());
        System.out.println(bn2.getVal());

        System.out.println("bn1 : "+bn1);
        System.out.println("bn2 : "+bn2);

        String str = "asdsad";
        System.out.println(str);
        //->println이 String으로 보내려는 성질이 있음.

    }
}
//String 클래스 내에 equals는 값을 비교하라고 오버라이딩을 해서 주소값을 비교함
