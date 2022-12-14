package chapters.chapter_09.exercises;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return (this.endTime - this.startTime);
    }

}
