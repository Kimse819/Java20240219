package ch06.p2method.Exam;

public class MemberService {
    boolean login(String id, String password) {
        // 아이디와 비밀번호가 맞으면 true를 반환하고, 아니면 false를 반환합니다.
        if (id.equals("hong") && password.equals("12345")) {
            System.out.println();
            return true;
        } else {
            return false;
        }
    }

    void logout(String id) {
        // 로그아웃 메시지를 출력합니다.
        System.out.println(id + "님이 로그아웃 하셨습니다.");
    }
}
//login() 메소드는 매개값 id가 "hong" 매개값 password가 "12345"일 때만 true로 리턴함
//logout() 메소드는 id + "님이 로그아웃 하셨습니다."가 되도록 출력할 것

