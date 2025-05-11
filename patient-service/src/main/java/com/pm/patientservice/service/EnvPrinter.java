package com.pm.patientservice.service;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EnvPrinter implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment env = event.getEnvironment();

//        System.out.println("===== ENVIRONMENT VARIABLES =====");
//        for (Map.Entry<String, Object> entry : env.getSystemEnvironment().entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
    }
}
