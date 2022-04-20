package com.supmti.tp02.banque.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Personne {
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
}
