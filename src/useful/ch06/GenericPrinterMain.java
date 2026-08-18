package useful.ch06;

import java.util.ArrayList;

public class GenericPrinterMain {
    public static void main(String[] args) {
        // 제네릭 프로그래밍을 활용하면 타입에 안정성을 줘서 컴파일 시 명확하게 타입지정 가능.
        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        // <Plastic>을 작성해 printer1변수는 Plastic타입만 주입한다고 지정 가능.
        GenericPrinter<Plastic> printer1 = new GenericPrinter();
        printer1.setMaterial(plastic1);
        System.out.println(printer1.getMaterial());

        Plastic tempPlastic = printer1.getMaterial(); // Object사용과 달리 다운캐스팅 필요없음.

        // 제네릭 사용 핵심 - 변수명을 똑같이 사용해야하는데 데이터타입이 다양하게 처리돼야할때 ,
        // 제네릭 문법 사용하면 아주 많은 이점이 있음.
        // ArrayList사용할 때 제네릭 많이 사용.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
//        list.add(10.1); // 오류 발생.

    }
}
