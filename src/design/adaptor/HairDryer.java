package design.adaptor;

public class HairDryer implements IElectronic110V{
    @Override
    public void connect() {
        System.out.println("헤어드라이기 연결(110V)");
    }
}
