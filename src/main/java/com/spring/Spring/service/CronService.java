package com.spring.Spring.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronService {

    @Scheduled(cron = "0 * * * * ?")
    public void cron(){
        System.out.println("Cron running");
    }

}
