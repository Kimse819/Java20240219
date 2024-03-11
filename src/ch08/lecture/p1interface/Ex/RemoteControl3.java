package ch08.lecture.p1interface.Ex;

public interface RemoteControl3 {
    int MAX_VLOUME = 10;
    int MIN_VLOUME = 0;
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VLOUME);
        }else {
            System.out.println("무음 해제합니다.");
        }
    }
}
