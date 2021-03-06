package com.scheduling.schedulingtest;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ProcessAsync {


    @Async
    public void run() throws InterruptedException {
        System.out.println("---Async process run--->Begin " + Thread.currentThread().getName() + LocalDateTime.now());
        Thread.sleep(1000);
        System.out.println("---Async process run--->End " + Thread.currentThread().getName() + LocalDateTime.now());
    }
}
