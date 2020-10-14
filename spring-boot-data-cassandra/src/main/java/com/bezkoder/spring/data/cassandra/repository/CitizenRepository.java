package com.bezkoder.spring.data.cassandra.repository;

import com.bezkoder.spring.data.cassandra.model.Citizen;
import java.util.List;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CitizenRepository extends CassandraRepository<Citizen, String> {

    public List<Citizen> findAll();

}
