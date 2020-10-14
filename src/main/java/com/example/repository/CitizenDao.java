package com.example.repository;

import com.example.entity.Citizen;
import java.util.List;

public interface CitizenDao {
    public List<Citizen> findAll();
    public Citizen save(Citizen citizen);
}
