package src.ClassandOopOject.baitap;



public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime=System.currentTimeMillis();
        System.out.println("start: "+startTime);
    }

    public void stop(){
        endTime=System.currentTimeMillis();
        System.out.println("endtime: "+endTime);

    }

    public int getElapsedTime(){
      int miliSecond= (int) (this.endTime-this.startTime);
        return miliSecond;
    }
}
