package com.example.Service;

import com.example.entity.Citizen;
import com.example.repository.product.CitizenRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    @Transactional
    public Citizen addProduct(Citizen citizen) {
        Citizen product1 = citizenRepository.save(citizen);
        return product1;
    }

    public List<Citizen> getAllCitizens(){
        return (List<Citizen>) citizenRepository.findAll();

    }

}
