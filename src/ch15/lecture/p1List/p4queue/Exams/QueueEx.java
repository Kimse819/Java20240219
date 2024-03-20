package ch15.lecture.p1List.p4queue.Exams;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<message> messageQueue = new LinkedList<>();

        messageQueue.offer(new message("sendMail", "홍길동"));
        messageQueue.offer(new message("sendMs", "신용권"));
        messageQueue.offer(new message("sendKakaotalk", "강정호"));

        while (!messageQueue.isEmpty()){
            message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "남에게 메일을 보냈습니다.");
                    break;
                case "sendMs":
                    System.out.println(message.to + "남에게 SMS를 보냈습니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "남에게 카카오톡을 보냈습니다.");
                    break;
            }
        }
    }
}
