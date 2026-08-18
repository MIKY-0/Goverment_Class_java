package useful.ch07;

public class MainTest {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        Water water = new Water();
        GenericPrinter printer = new GenericPrinter();
//        printer.setMaterial(water); // 사실 범위에 제한이 없기 때문에 무엇이든 들어갈 수 있음.
        printer.setMaterial(plastic);

    }
}
