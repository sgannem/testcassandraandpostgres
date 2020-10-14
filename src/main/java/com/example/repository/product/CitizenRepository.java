package com.example.repository.product;

import com.example.entity.Citizen;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CitizenRepository extends CrudRepository<Citizen, String> {
    public List<Citizen> findAll();
}
