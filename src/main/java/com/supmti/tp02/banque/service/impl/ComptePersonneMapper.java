package com.supmti.tp02.banque.service.impl;

import com.supmti.tp02.banque.entity.Personne;
import com.supmti.tp02.banque.entity.dto.CompteDTO;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;


@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface ComptePersonneMapper {
    Personne toDTO(CompteDTO in);
}