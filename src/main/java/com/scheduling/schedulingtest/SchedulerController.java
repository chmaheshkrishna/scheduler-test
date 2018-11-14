package com.scheduling.schedulingtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/scheduler")
public class SchedulerController {

    @Autowired
    private ProcessAsync process;

    @PostMapping
    public HttpEntity<String> trigger() throws InterruptedException {
        process.run();
        return new HttpEntity<>("Trigger running in background");
    }
}
