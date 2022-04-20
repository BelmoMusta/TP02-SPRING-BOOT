package com.supmti.tp02.banque.dao.api;


import com.supmti.tp02.banque.entity.Compte;

public interface CompteDAO {
    void creerPersonne(Compte compte);

    Compte recupererParPersonneId(Long personneId);

    void supprimerParId(Long id);
}
