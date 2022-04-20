package com.supmti.tp02.banque.dao.api;


import com.supmti.tp02.banque.entity.Personne;

public interface PersonneDAO {
    void creerPersonne(Personne p);
    void supprimerParId(Long id);
}
