package ch07;

public class DmbCellPhoneTest {
    public static void main(String[] args) {
        DmbCellPhone dcp = new DmbCellPhone("갤럭시 S21","내심장의 색깔은 Black",10);

        dcp.powerOn();
        dcp.powerOff();
        dcp.printInfo();
        System.out.println("채널 : "+dcp.channel);
        dcp.sendMsg("자니,,?");
    }
}
