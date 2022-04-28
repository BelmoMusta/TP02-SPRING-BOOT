package com.supmti.tp02.banque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "X06597")
public class Compte {
    @Id
    private Long id;
    @Column(name = "X06597_1")
    private Long personneId;
    private BigDecimal depotInitial;
    private BigDecimal encours;


}
