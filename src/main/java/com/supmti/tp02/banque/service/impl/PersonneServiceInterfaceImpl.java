package com.supmti.tp02.banque.service.impl;

import com.supmti.tp02.banque.dao.api.PersonneRepository;
import com.supmti.tp02.banque.entity.Personne;
import com.supmti.tp02.banque.service.api.PersonneServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonneServiceInterfaceImpl implements PersonneServiceInterface {
    @Autowired
    PersonneRepository personneRepository;
    @Override
    public void creerCompte(Personne personne) {
        Optional<Personne> personneOptional = personneRepository.findById(1L);
        personneOptional.ifPresent(p -> {
            System.out.println(p);
        });

    }
}
