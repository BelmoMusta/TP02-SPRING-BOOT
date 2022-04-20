package com.supmti.tp02.banque.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompteDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
}
