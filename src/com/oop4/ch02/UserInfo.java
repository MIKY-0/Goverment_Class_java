package com.oop4.ch02;

public class UserInfo {
    String userId;
    String userPw;
    String userName;
    String userAddress;
    String phoneNumber;

    // 객체가 생성될때 가장 먼저 실행.
    public UserInfo(String userId) {
        this.userId = userId;
    }

    public UserInfo(String userId , String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }

    public UserInfo(String userId , String userPw , String userName) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
    }

    public UserInfo(String userId , String userPw , String userName , String userAddress) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userAddress = userAddress;
    }

    public UserInfo(String userId, String userPw, String userName, String userAddress, String phoneNumber) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNumber = phoneNumber;
    }
}
