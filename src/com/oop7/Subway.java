package com.oop7;

public class Subway {
    private int lineNumber;
    private int price;

    public Subway(int lineNumber , int price) {
        this.lineNumber = lineNumber;
        this.price = price;
    }

    int subLine() {return  this.lineNumber;}
    int subPrice() {return this.price;}

    void trySubway() {
        System.out.println(this.lineNumber + "호선 지하철을 탑니다. " + this.price + "원이 차감됩니다.");
    }

    void noMoney(Student std) {
        System.out.printf("남은 잔액(%d원)이 %d원 보다 적습니다. %d원 이상 충전해주세요.\n" ,
                std.stdMoney() , this.price , this.price - std.stdMoney());
    }

    int takeStd(Student std) {
        return std.stdMoney() - price;
    }
}
