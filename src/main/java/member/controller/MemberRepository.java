package member.controller;

import member.model.vo.Member;

import java.util.List;

public class MemberRepository {
    private List<Member> memberList;

    public MemberRepository() {}

    public void insertMember(Member m) {
        memberList.add(m);
    }

    public void printData(){
        for (int i = 0; i < memberList.size(); i++) {
            Member m = memberList.get(i);
            System.out.println(m.getGrade() + " 등급 회원 " + m.getName() + "의 포인트는 " + m.getPoint() + "이고, 이자 포인트는 " + m.calculateInterest());
        }
    }

    public void printBuyInfo(int price){
    // Silver 등급 회원 홍길동는 10000원 상품을 9800원에 구매합니다.
        for (int i = 0; i < memberList.size(); i++) {
            Member m = memberList.get(i);
            System.out.println(m.getGrade() + " 등급 회원 " + m.getName() + "은(는) 10000원 상품을 " + (10000 * (1 - m.calculateInterest())) + "원에 구매합니다.");
        }
    }
}
