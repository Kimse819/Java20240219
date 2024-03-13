package ch09.lecture.p1nested.p2anonymous;

public class C07Sample {
    public static void main(String[] args) {
        // 가위 바위 보 게임 익명 클래스 객체 생성
        Game rpsGame = new Game() {
            @Override
            public void play() {
                String[] options = {"가위", "바위", "보"};
                int randomIndex = (int) (Math.random() * options.length);
                System.out.println("가위 바위 보: " + options[randomIndex]);
            }
        };

        // 가위 바위 보 게임 실행
        rpsGame.play();

        // 로또 게임 익명 클래스 객체 생성
        Game lottoGame = new Game() {
            @Override
            public void play() {
                int[] lottoNumbers = new int[6];
                boolean[] isPicked = new boolean[46]; // 1부터 45까지의 숫자가 나왔는지 체크

                System.out.print("1 ~ 45 사이의 숫자 출력: "); //출력되는 숫자는 중복이 없어야 함
                for (int i = 0; i < 6; i++) {
                    int number;
                    do {
                        number = (int) (Math.random() * 45) + 1;
                    } while (isPicked[number]); // 이미 뽑은 숫자라면 다시 뽑기
                    lottoNumbers[i] = number;
                    isPicked[number] = true;
                    System.out.print(number + " ");
                }
                System.out.println();
            }
        };

        // 로또 게임 실행
        lottoGame.play();
    }

    interface Game {
        void play();
    }
}

