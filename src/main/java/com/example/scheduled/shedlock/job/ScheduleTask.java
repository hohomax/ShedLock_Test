package com.example.scheduled.shedlock.job;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScheduleTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleTask.class);

    @Scheduled(cron = "0 * * * * ?") // 매분마다 실행
    @SchedulerLock(name = "ScheduledTask_run")
    public void runTask() throws InterruptedException{

        System.out.println("task1"+ LocalDateTime.now());
        wait(5000);


    }
    @Scheduled(cron = "0 * * * * ?") // 매분마다 실행
    @SchedulerLock(name = "ScheduledTask_run")
    public void runTask2() throws InterruptedException{

        System.out.println("task2"+  LocalDateTime.now());
        wait(10000);
    }
}
