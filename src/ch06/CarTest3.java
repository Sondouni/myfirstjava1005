package ch06;

public class CarTest3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        Car car2 = new Car("현대","산타페");
        car2.drive();
        car2.stop();
    }
}
