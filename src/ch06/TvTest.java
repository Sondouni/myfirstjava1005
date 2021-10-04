package ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        System.out.println("tv brand : "+tv.getBrand());
        System.out.println("tv inch : "+tv.getInch());
        tv.setBrand("Apple");
        tv.setInch(100);
        System.out.println("tv brand : "+tv.getBrand());
        System.out.println("tv inch : "+tv.getInch());
//        tv.brand = "샘성";-> private때문에 안됨,getter setter를 이용하자!
        Tv tv2 = new Tv();
        System.out.println("tv2 brand : "+tv2.getBrand());
        System.out.println("tv2 inch : "+tv2.getInch());
        tv2.setBrand("LG");
        tv2.setInch(200);
        System.out.println("tv2 brand : "+tv2.getBrand());
        System.out.println("tv2 inch : "+tv2.getInch());
    }
}
