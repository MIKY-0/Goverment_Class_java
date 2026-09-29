package com.oop_test.ch04;

import java.util.List;

public class MemberService {
    private MemberDao memberDao = new MemberDao();

    public void registerMember(String id , String name) {
        Member member = new Member(id , name);
        memberDao.insert(member);
    }
    public void printAllMembers() {
        List<Member> memberList = memberDao.findAll();
        for(Member m : memberList) System.out.println("id : " + m.getId() + " , 이름 : " + m.getName());
    }
}
