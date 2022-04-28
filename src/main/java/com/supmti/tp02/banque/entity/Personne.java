package com.supmti.tp02.banque.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Personne {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
}
