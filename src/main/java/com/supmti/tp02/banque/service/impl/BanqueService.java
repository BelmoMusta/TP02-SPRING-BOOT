package com.supmti.tp02.banque.service.impl;

import com.supmti.tp02.banque.entity.Personne;
import com.supmti.tp02.banque.service.api.BanqueServiceInterface;
import org.springframework.stereotype.Service;


@Service
//@Component
public class BanqueService implements BanqueServiceInterface {

    public void creerCompte(Personne personne) {

        System.out.println(personne);
    }
}
