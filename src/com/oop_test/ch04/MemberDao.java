package com.oop_test.ch04;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    List<Member> store = new ArrayList<>();

    public void insert(Member member) {
        store.add(member);
        System.out.println(member.getName() + " 회원 정보가 메모리에 저장되었습니다.");
    }

    public List<Member> findAll() {
        return store;
    }

}
