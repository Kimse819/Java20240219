package ch06.p7access;

public class C04GetterSetter {
}

class C04MyClass {
    private String name;
    private int age;
    private boolean married; // get -> is

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

//계좌는 account 객체로 생성 BankApplication에서 길이 100인 account[] 배열로 관리하는 코드
