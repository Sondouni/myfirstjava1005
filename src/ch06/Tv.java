package ch06;

public class Tv {
    private String brand;
    private int inch;
//    Tv(String str, int inch){
//        this.brand = str;
//        this.inch  = inch;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    //getters,setters ->>>은닉,캡슐화
}
