package com.supmti.tp02.banque;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class MyProperties {
    @Value("${application.clef1:introuvable}") // SpEL
    private String clef1;

    @Value("${application.clef2:introuvable}") // SpEL
    private String clef2;
}
