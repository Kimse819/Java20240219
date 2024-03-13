package ch16.lecture.p1lambda.sec1.Ex06.Ex08;

public class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore ){
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() { return name; }
    public int getEnglishScore(){ return englishScore; }
    public int getMathScore(){ return mathScore; }
}
