package classandobject;
public class StopWatch {
//    ______________________________
//|           StopWatch         |
//            |----------------------------|
//            | - startTime: long           |
//            | - endTime: long             |
//            |----------------------------|
//            | + StopWatch()               |
//            | + getStartTime(): long      |
//            | + getEndTime(): long        |
//            | + start(): void             |
//            | + stop(): void              |
//            | + getElapsedTime(): long   |
//            |____________________________|
    private long startTime;
    private long endTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime- startTime;
    }
}
