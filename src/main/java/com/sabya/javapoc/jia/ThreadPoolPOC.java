package com.sabya.javapoc.jia;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolPOC {
    public static void main(String[] args) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();
        executor.setQueueCapacity(1000);
        executor.setCorePoolSize(2);
        executor.setThreadNamePrefix("DDP-WORKER");
        executor.initialize();

        for(int i = 1; i < 1000; i++) {
            int finalI = i;
            executor.submit(() -> {System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
