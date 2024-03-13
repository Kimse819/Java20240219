package ch16.lecture.p1lambda.ex1;

public class Button {

    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        clickListener.onClick();
    }
}