package design.adaptor;

/*
 핵심 (어댑터 클래스)
 110v받아서 220v로 나가도록.
 */
public class ElectronicAdaptor implements IElectronic220V{
    private IElectronic110V electronic110V;

    public ElectronicAdaptor(IElectronic110V iElectronic110V){
        this.electronic110V = iElectronic110V;
    }

    @Override
    public void connect() {
        electronic110V.connect();
    }
}
