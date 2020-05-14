package src.ClassandOopOject.baitap;

import java.time.LocalTime;

public class runStopWatch {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        StopWatch sw = new StopWatch(start, end);
        sw.start();
        int []a= new int [1000];
        for (int i = 0; i < 1000; i++) {
            a[i]=(int)(Math.random()*10);
        }
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println("");
        sw.stop();
        System.out.println( sw.getElapsedTime());

    }
}
