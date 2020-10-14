package com.example.repository;

import com.example.entity.Citizen;
import com.example.entity.QCitizen;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.mysema.query.jpa.impl.JPAQuery;

@Repository("citizenDao")
public class CitizenDaoImpl implements CitizenDao {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public Citizen save(Citizen citizen) {
    this.entityManager.persist(citizen);
    return citizen;
  }

  @Override
  public List<Citizen> findAll() {
    TypedQuery<Citizen> query =
      entityManager.createQuery("SELECT c FROM Citizen c", Citizen.class);
    List<Citizen> results = query.getResultList();
    return results;
  }
}
