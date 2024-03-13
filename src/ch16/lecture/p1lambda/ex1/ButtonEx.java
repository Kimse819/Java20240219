package ch16.lecture.p1lambda.ex1;

public class ButtonEx {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(() -> System.out.println("OK 버튼 클릭"));
        btnOk.click();

        Button btnCancel = new Button();

        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼 클릭"));

        btnCancel.click();
    }
}
