import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.Supplier;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//https://stackoverflow.com/questions/18926839/timer-stopwatch-gui

import javax.swing.JFrame;

public class Timer implements Runnable {

    private Thread runThread;
    private boolean running = false;
    private boolean paused = false;
    private DrinkTimerPanel timeFrame;
    private long summedTime = 0;

    public Timer(DrinkTimerPanel timeFrame) {
        this.timeFrame = timeFrame;
    }

    public static void main(String[] args) {
        DrinkTimerPanel t = new DrinkTimerPanel();
        JFrame f = new JFrame("Timer");
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane().add(t);
        f.setVisible(true);
    }

    public void startTimer() {
        if(running == false){
            running = true;
            paused = false;
            // start the thread up
            runThread = new Thread(this);
            runThread.start();
        }
    }

    public void pauseTimer() {
        // just pause it
        paused = true;
        running = false;
    }

    public void resetTimer(){
        stopTimer();
        summedTime = 0;
        timeFrame.update(0);
    }

    public void stopTimer() {
        // completely stop the timer
        running = false;
        paused = false;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        // keep showing the difference in time until we are either paused or not running anymore
        while(running && !paused) {
            timeFrame.update(summedTime + (System.currentTimeMillis() - startTime));
        }
        // if we just want to pause the timer dont throw away the change in time, instead store it
        if(paused)
            summedTime += System.currentTimeMillis() - startTime;
        else 
            summedTime = 0;
    }
}