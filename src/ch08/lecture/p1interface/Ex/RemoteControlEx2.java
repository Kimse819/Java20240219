package ch08.lecture.p1interface.Ex;

public class RemoteControlEx2 {
    public static void main(String[] args) {
        RemoteControl3 rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println("-------------");

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println("----------------------");

        RemoteControl3.ChangeBattery();
    }
}
