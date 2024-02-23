package ch03.lecture.arithemetic;

public class C03Overflow {
    public static void main(String[] args) {
        int a = 2_000_000_000;
        int b = 1_000_000_000;

        //Overflow: 산술 연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 얻음
        int c = a + b;
        System.out.println("c = " + c);

        //overflow를 방지하려면
        //적절한 data typw을 선택해야ㅐ한다.

        int d = 2_000_000_000;
        int e = 1_000_000_000;
        int f = d + e;
        System.out.println("c = " + c);
    }
}
