package others;

public class Somethings {
    /*
    *static class : 바깥클래스들은 static 이 생략되어있음
    * innerclass를 사용할때(중첩클래스) staitc으로 사용
    * -> 보통 스레드를 이용할때 사용
     */

    /*
    은닉화,캡슐화
    멤버필드 숨겨져있음 (값을 바로 넣을수없음)
    객체에 은닉화된 멤버필드에 값을 넣을수 있는 방법 2가지지
    -setter를 이용해 객체에 값을 넣음
    -생성자를 이용해서 객체에 값을 넣음
    객체에 은닉화된 맴버필드의 값을 빼내는 방법
    -getter
     */

    /*
    Final키워드 사용범위
    클래스 (상속금지)
    멤버필드 (상수)
    메소드 (오버라이딩이 안된다)
     */

    /*
    다형성 ( 여러가지 형태가 있는 성질 )
    1.부모타입은 자식객체 주소값을 저장할수 있다.(가리킬수 있다)
    2.자식타입은 부모객체주소값을 저장할수 없다 (가리킬수 없다) 컴파일에러 발생
     ->downCasting(강제형변환)을 이용해 가능
    3.메소드 호출은 타입이 알고있는 것만 호출할수있고, 내용은 "객체" 기준이다.

     */
}
