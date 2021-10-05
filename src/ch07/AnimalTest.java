package ch07;
/*
    다형성 ( 여러가지 형태가 있는 성질 )
    1.부모타입은 자식객체 주소값을 저장할수 있다.(가리킬수 있다) (참조할수 있다)
    2.자식타입은 부모객체주소값을 저장할수 없다 (가리킬수 없다) 컴파일에러 발생
     ->downCasting(강제형변환)을 이용해 가능
    3.메소드 호출은 타입이 알고있는 것만 호출할수있고, 내용은 "객체" 기준이다.

     */
public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new BigCat(); //쌉가능
//        Animal animal = new BigCat();
//        Animal animal2 = new Cat();
//        Animal animal3 = new Animal();
        /*
        Object obj = new Animal();
        Object obj2 = new Dog();//                        -> 모든것을 참조가능,쌉가능~~~~~~~~~~~~~~~~~
        Object objInt = 1;
        Integer integer = new Integer(1);
        Float f  = new Float(1023.232);
        */


//        Cat cat1 = new Animal();
//        BigCat sads = new Cat();                      ->자식객체에 부모를 참조하는것은 불가능
        Cat cat2 = new BigCat();
        cat2.crying();
//        cat2.sleep();->Cat에 없기때문에 가져오지 못함
//        Cat cat3 = (Cat)animal3;
//        Cat cat4 = (Cat)(new Animal);
        BigCat bigcat1 = (BigCat)cat2; // 자식객체에 부모를 참조하려면 강제형변환을 시켜야함
    }
}
