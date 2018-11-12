package com.scheduling.schedulingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingTestApplication.class, args);
    }
}
