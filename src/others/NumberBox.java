package others;

public class NumberBox {
    private int val;
    public NumberBox(int val){
        this.val=val;
    }
    public int getVal(){
        return this.val;
    }
    @Override
    public boolean equals(Object obj){
        NumberBox temp = (NumberBox)obj;
        return temp.val == this.val;
    }
    @Override
    public String toString(){
//        return this.val+""; -> int + String 을 하게되면 강제 형변환이된다
//        return Integer.toString(this.val); //int 를 string으로 보내는 메서드
        return String.valueOf(this.val); //정수뿐만 아니라 모든것을 String으로 보내줌
    }
}
