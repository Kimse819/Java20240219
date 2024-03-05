package ch06.p2method.Exam;

public class MemberServiceEx {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean reslut = memberService.login("hong", "12345");
        if (reslut){
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        }else {
            System.out.println("id 또는 password가 맞지 않습니다.");
        }
    }
}
