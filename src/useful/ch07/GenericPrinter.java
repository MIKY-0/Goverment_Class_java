package useful.ch07;

/**
 * <T extends 클래스> 를 사용하면 T타입에 자식타입만 들어오도록 제한을 걺.
 * 현재코드에서는 Material 을 상속 받은 자식클래스만 대체문자열에 들어올 수 있도록 범위 제한.
 */

public class GenericPrinter<T extends Material> {
    // 자료형 매개변수(type parameter)
    T material; // 데이터 타입에 대체문자 선언 가능. 단, 클래스가 제네릭 클래스라고 선언돼야함.

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }


}
