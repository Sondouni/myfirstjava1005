package others;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
//옛날에는 *을 안썻는데, 요즘은 컴퓨터 성능도 좋고 컴파일러가 잘 가져와서 java.util.*을 쓴다

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(); //객체를 선언하는데, 데이터값(타입)이 다르면 상속관계이다
        list.add(10);
        list.add(20);
        list.add(30);
//        list.add(123.1);
//        list.add("asdasd");
//        list.add('a');
//        list.add(true); List,ArrayList를 사용시 모든값을 다 넣을수 있으나, List옆 타입값을 적게된다면 그 타입값만 입력가능
        System.out.println(list);
        for(int i = 0;i<list.size();i++){
            System.out.printf("(%d)-%d\n",i,list.get(i));//list.get : 객체안에 배열중 i번째를 리턴해라
        }
        int removeVal=list.remove(0);//list.remove : 객체안에 배열중 i번째를 지우고,리턴해라
        System.out.println("removeVal : "+ removeVal);

        for(int i = 0;i<list.size();i++){
            System.out.printf("(%d)-%d\n",i,list.get(i));
        }
    }
}
//ArrayList, linkedList = 배열
/*
ArrayList : 깊은복사를 이용 배열값에서 배열을 늘리거나, 값을 추가하기위해 사용
LinkedList : 똑같은 일을 하지만, 주소값을 하나 만들어 삽입하고 빠져나옴
 */
//List는 객체이니까 list.size()를 통해 길이를 알수있다.
//ArrayList객체내에 size메소드가 있어서 객체내의 배열크기를 리턴해준다
//List.get(i) i번째 값을 가져와라