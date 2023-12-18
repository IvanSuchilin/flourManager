package com.example.flourManger.engine;

import com.example.flourManger.beans.Water;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaterWheel extends Engine {
    private  final Logger logger = LoggerFactory.getLogger(WaterWheel.class);
    private final Queue<Water> waterFlow;
    private final int MAX_POWER = 10;
    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public WaterWheel(Queue<Water> waterFlow) {
        setName("Thread.WaterWheel");
        this.waterFlow = waterFlow;
    }

    @Override
    public void run() {
            while(!isInterrupted()){
                Water water = waterFlow.poll();
                this.executor.execute(()->{
                    if(water != null && this.getPower()< MAX_POWER){}
                    this.upPower(water.getPower());
                });
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    logger.error(e.getMessage());
                }
            }
    }
}
