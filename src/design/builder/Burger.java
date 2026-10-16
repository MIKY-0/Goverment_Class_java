package design.builder;

/*
빌더패턴의 장점 : 생성 순서가 정해져있지 않고 원하는 것만 넣어도 됨.
 */

// 햄버거 클래스 : 빌더패턴을 적용한 클래스를 설계해 보자.
public class Burger {
    private String bread;
    private String patty;
    private String sauce;

    private Burger(Builder builder) {
        this.bread = builder.bread;
        this.patty = builder.patty;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "{" +
                "bread='" + bread + '\'' +
                ", patty='" + patty + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    /*
     1. private 생성자 : 외부에서 new Burger()로 직접 만들 수 없게 함.
     2. 빌더의 build() 메서드를 통해서만 객체가 만들어지도록 함.
     */

    public static class Builder{
        private String bread;
        private String patty;
        private String sauce;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder patty(String patty) {
            this.patty = patty;
            return this;
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        // 핵심 메서드(마지막에 호출) : 모든 값으로 Burger를 만들어서 돌려줌.
        public Burger build(){
            return new Burger(this);
        }

    }

}
