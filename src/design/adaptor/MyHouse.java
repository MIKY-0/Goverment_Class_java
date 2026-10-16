package design.adaptor;

public class MyHouse {
    // 220V 콘센트에 전자기기를 연결하는 메서드를 가지고 있음.
    public static void plugIn(IElectronic220V device){
        device.connect();
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        HairDryer hairDryer = new HairDryer();
        ElectronicAdaptor electronicAdaptor = new ElectronicAdaptor(hairDryer);
//        plugIn(cleaner);
//        plugIn(hairDryer);  // 규격이 안맞아서 사용 못함.(어댑터 필요)

        plugIn(electronicAdaptor);
    }
}
