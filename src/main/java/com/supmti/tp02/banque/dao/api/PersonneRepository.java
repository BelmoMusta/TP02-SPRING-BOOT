package com.supmti.tp02.banque.dao.api;

import com.supmti.tp02.banque.entity.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {
}
