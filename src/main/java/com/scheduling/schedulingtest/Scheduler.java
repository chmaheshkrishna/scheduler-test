package com.scheduling.schedulingtest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Scheduled(initialDelayString = "${scheduling.task.initialDelayString}", fixedDelayString = "${scheduling.task.fixedDelay}")
    public void fixedDelay() {
        System.out.println("=====fixedDelay called===" + LocalDateTime.now());
    }

    @Scheduled(cron = "${scheduling.task.cron}")
    public void cron() {
        System.out.println("---cron job called==" + LocalDateTime.now());
    }
}

