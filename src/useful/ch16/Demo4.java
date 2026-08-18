package useful.ch16;

public class Demo4 {
    public static void main(String[] args) {
        // 1단계 : 매개변수 타입 생략 가능.
        MathOperation add = (x , y) -> {return x + y;};

        // 2단계 : 중괄호와 리턴타입 생략.
        MathOperation sub = (x , y) -> x - y;

        // 주의 : 만약 여러줄이 필요하다면 중괄호, return 있어야함.
        MathOperation divide = (x , y) -> {
          if(y == 0){
              System.out.println("0으로 나눌수 없음");
                return 0;
          }
            return x / y;
        };

        System.out.println(add.operate(10 , 10));
        System.out.println(sub.operate(10 , 10));
        System.out.println(divide.operate(10 , 0));

    }

}
