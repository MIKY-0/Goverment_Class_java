package design.builder;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(Builder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Person builder(){
            return new Person(this);
        }
    }
}
