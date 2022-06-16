package com.springboot.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTaskService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTaskService.class);
    private static final DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void executeWithFixedRate() {
        // some logic that will be executed on a schedule
        LOGGER.info("Code is being executed with fixedRate ...");
    }

    @Scheduled(fixedDelay = 5000)
    public void executeWithFixDelay() throws InterruptedException {
        // some logic that will be executed on a schedule
        Thread.sleep(3000);
        String message = "Code is being executed with fixedDelay ... Time: "+ formater.format(LocalDateTime.now());
        LOGGER.info(message);
    }

    @Scheduled(fixedRate = 5000, initialDelay = 4000)
    public void executeWithFixRateAndInitialDelay(){
        // some logic that will be executed on a schedule
        String message = "Code is being executed with fixedRate and initialDelay ... Time: "+ formater.format(LocalDateTime.now());
        LOGGER.info(message);
    }

    @Scheduled(cron = "0 0 10 * * *")
    public void executeWithCron(){
        // some logic that will be executed on a schedule
        String message = "Code is being executed with Cron ... Time: "+ formater.format(LocalDateTime.now());
        LOGGER.info(message);
    }

    @Scheduled(cron = "${com.schedule.cron}")
    public void executeWithCronGetFromProperties(){
        // some logic that will be executed on a schedule
        String message = "Code is being executed with Cron get from properties ... Time: "+ formater.format(LocalDateTime.now());
        LOGGER.info(message);
    }




}
