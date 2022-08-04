package ss4_class_object.bai_tap.stopwatch;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {


    }

    public void setStart() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStart() {
        return startTime;
    }


    public void setStop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStop() {
        return endTime;
    }

    public long getElapsedTime() {
        return (this.getStop() - this.getStart());

    }
}
