package com.supmti.tp02.banque.event.lisetener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventListenerExample {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publierEvenement(){
        MonEvent event = new MonEvent(this.getClass().getName());
        applicationEventPublisher.publishEvent(event);
    }
}
