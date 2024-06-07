package member.controller;

import member.model.exception.OverMemberException;
import member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> memberList = new ArrayList<>();

    public MemberRepository() {}

    public void insertMember(Member m) throws Exception {
        if (memberList.size() >= 10){
            throw new OverMemberException("Member List is full");
        } else{
            memberList.add(m);
        }
    }

    public void printData(){
        for (int i = 0; i < memberList.size(); i++) {
            Member m = memberList.get(i);
            System.out.println(m.getGrade() + " 등급 회원 " + m.getName() + "의 포인트는 " + m.getPoint() + "이고, 이자 포인트는 " + m.calculateInterest());
        }
    }

    public void printBuyInfo(int price){
        for (int i = 0; i < memberList.size(); i++) {
            Member m = memberList.get(i);
            System.out.println(m.getGrade() + " 등급 회원 " + m.getName() + "은(는) " + price + "원 상품을 " + (int)(price - (price * m.calculateInterest()/m.getPoint())) + "원에 구매합니다.");
        }
    }
}
