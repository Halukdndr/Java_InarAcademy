package chapters.chapter_10.exercises;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long currentTime = System.currentTimeMillis();
        this.setTime(currentTime);
    }
    public Time(long time){
        this.setTime(time);
    }
    public Time(long hour,long minute,long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(long elapsedTime){
        this.second = elapsedTime / 1000 % 60;
        this.minute = elapsedTime / 1000 / 60 % 60;
        this.hour = elapsedTime / 1000 / 60 / 60 % 24;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    public void display(){
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }
}
