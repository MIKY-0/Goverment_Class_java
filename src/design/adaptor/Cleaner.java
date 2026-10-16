package design.adaptor;

public class Cleaner implements IElectronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 연결됨(220V)");
    }
}
