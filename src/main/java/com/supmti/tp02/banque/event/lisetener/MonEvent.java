package com.supmti.tp02.banque.event.lisetener;

import com.supmti.tp02.banque.entity.dto.CompteDTO;
import org.springframework.context.ApplicationEvent;

public class MonEvent extends ApplicationEvent {
    private String sourceSurLApplication;
    CompteDTO compteDTO;
    public MonEvent(Object source) {
        super(source);
        sourceSurLApplication = String.valueOf(source);
    }
}
