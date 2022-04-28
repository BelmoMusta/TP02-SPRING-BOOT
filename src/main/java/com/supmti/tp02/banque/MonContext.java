package com.supmti.tp02.banque;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MonContext implements ApplicationContextAware {
    ApplicationContext applicationContext;

    @Autowired
    private MyProperties myProperties;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        Environment environment = applicationContext.getEnvironment();
        System.out.println("recuperation de l'environnement");
        System.out.println(myProperties.getClef1());
    }
}
