package chapters.chapter_09.examples;

public class TV {
    public int channel;
    public int volumeLevel;
    public boolean on;

   public TV(){}
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp(){
        if (on && channel < 120) {
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel > 1) {
            channel--;
        }
    }
    public void volumeUp(){
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}
