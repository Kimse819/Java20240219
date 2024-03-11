package ch08.lecture.p1interface.Ex;

public interface RemoteControl2 {
    int MAX_VLOUME = 10;
    int MIN_VLOUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
