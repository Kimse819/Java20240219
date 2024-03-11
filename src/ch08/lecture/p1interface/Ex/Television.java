package ch08.lecture.p1interface.Ex;

public class Television implements RemoteControl2, RemoteControl3 {
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if (volume > RemoteControl2.MAX_VLOUME){
            this.volume = RemoteControl2.MAX_VLOUME;
        } else if (volume < RemoteControl2.MIN_VLOUME) {
            this.volume = RemoteControl2.MIN_VLOUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        RemoteControl3.super.setMute(mute);
    }

}
