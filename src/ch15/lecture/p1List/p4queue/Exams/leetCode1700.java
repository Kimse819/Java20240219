package ch15.lecture.p1List.p4queue.Exams;
import java.util.LinkedList;
public class leetCode1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        // LinkedList 생성 및 초기화
        LinkedList<Integer> studentQueue = new LinkedList<>();
        // 학생 수
        int len = students.length;
        // 학생들의 인덱스를 큐에 추가
        for (int i = 0; i < len; i++) {
            studentQueue.offer(i);
        }

        // 마지막 쿼리를 초기화
        int lastQuery = -1;
        // 샌드위치 인덱스
        int sIdx = 0;

        // 학생이 샌드위치를 먹을 수 있는지 확인
        while (sIdx < len) {
            // 마지막 쿼리가 현재 샌드위치의 학생과 같은 경우 루프 종료
            if (studentQueue.peekFirst() == lastQuery) {
                break;
            }
            // 현재 샌드위치를 먹을 수 있는 경우
            else if (students[studentQueue.peekFirst()] == sandwiches[sIdx]) {
                // 학생을 큐에서 제거하고 샌드위치 인덱스 증가
                studentQueue.pollFirst();
                // 마지막 쿼리 초기화
                lastQuery = -1;
                sIdx++;
            }
            // 현재 샌드위치를 먹을 수 없는 경우
            else {
                // 학생을 큐의 맨 뒤로 이동
                Integer tmp = studentQueue.pollFirst();
                studentQueue.offer(tmp);
                // 마지막 쿼리가 없는 경우 현재 학생의 인덱스로 설정
                if (lastQuery == -1) {
                    lastQuery = tmp;
                }
            }
        }

        // 남은 학생의 수를 반환
        return studentQueue.size();
    }
}



