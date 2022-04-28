package com.supmti.tp02.banque.controller;

import com.supmti.tp02.banque.MyProperties;
import com.supmti.tp02.banque.entity.Personne;
import com.supmti.tp02.banque.entity.dto.CompteDTO;
import com.supmti.tp02.banque.event.lisetener.EventListenerExample;
import com.supmti.tp02.banque.service.api.BanqueServiceInterface;
import com.supmti.tp02.banque.service.api.PersonneServiceInterface;
import com.supmti.tp02.banque.service.impl.ComptePersonneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/banque")
public class BanqueController {
    @Autowired
    MyProperties myProperties;
    @Autowired
    private BanqueServiceInterface banqueService;

    @Autowired
    private PersonneServiceInterface personneService;

    @Autowired
    ComptePersonneMapper mapper;

    @PostMapping(value = "/compte")
    public ResponseEntity doPost(@RequestBody CompteDTO compteDTO) throws Exception {
        Personne personne = mapper.toDTO(compteDTO);
        banqueService.creerCompte(personne);
        return ResponseEntity.status(HttpStatus.CREATED).body(compteDTO);

    }


    @GetMapping(value = "")
    public void doGet() throws Exception {
        personneService.creerCompte(new Personne());
        eventListenerExample.publierEvenement();
        System.out.println(myProperties.getClef1());
    }
    @Autowired
    private EventListenerExample eventListenerExample;
}
