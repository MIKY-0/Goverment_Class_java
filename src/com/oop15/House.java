package com.oop15;

public class House {
    private String address;

    // 합성관계 : House는 내부적으로 Room 객체를 소유.
    private Room livingRoom;
    private Room bedRoom;

    public House(String address) {
        this.address = address;

        // 합성조건 1 : House생성자 내부에 Room 객체 접근.
        this.livingRoom = new Room("거실");
        this.bedRoom = new Room("침실");
    }

    // 합성조건 2 : Room에 대한 getter메서드 안만듦.
    public void showInfo() {
        System.out.println(address + "에 위치한 집입니다.");
        livingRoom.use();
        bedRoom.use();
    }
}
