package com.supmti.tp02.banque.event.lisetener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MonListener implements ApplicationListener<MonEvent> {

    @Override
    public void onApplicationEvent(MonEvent event) {
        System.out.println("cet evenement est venu de la classe " + event.getSource());
    }
}
