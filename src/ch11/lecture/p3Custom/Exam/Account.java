package ch11.lecture.p3Custom.Exam;

public class Account {
    private long balance;

    public Account() { }

    public long getBalance() {
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InstuffcientExcetion{
        if (balance < money){
            throw new InstuffcientExcetion("잔고 부족: "+(money-balance)+" 모자람");
        }
        balance -= money;
    }
}
