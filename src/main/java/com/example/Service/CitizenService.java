package com.example.Service;

import com.example.entity.Citizen;
import com.example.repository.CitizenDao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenService {

    @Autowired
    private CitizenDao citizenDao;

    @Transactional
    public Citizen addProduct(Citizen citizen) {
        Citizen citizen1 = citizenDao.save(citizen);
        return citizen1;
    }

    public List<Citizen> getAllCitizens(){
        return (List<Citizen>) citizenDao.findAll();

    }

}
