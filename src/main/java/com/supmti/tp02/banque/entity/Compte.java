package com.supmti.tp02.banque.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


public class Compte {

    private Long id;
    private Long personneId;
    private BigDecimal depotInitial;
    private BigDecimal encours;


}
