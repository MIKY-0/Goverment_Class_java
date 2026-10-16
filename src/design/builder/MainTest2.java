package design.builder;

public class MainTest2 {
    public static void main(String[] args) {
        Person person1 = new Person.Builder()
                .name("한승환")
                .age(27)
                .address("부산")
                .builder();

        System.out.println(person1);
    }
}
