package com.example.controller;


import com.example.Service.CitizenService;
import com.example.entity.Citizen;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CitizenController {


    @Autowired
    private CitizenService citizenService;

    @PostMapping("/citizens")
    public Citizen addProduct(@Valid @RequestBody Citizen product) throws Exception {
        Citizen citizens = citizenService.addProduct(product);
        return citizens;
    }

    @GetMapping("/citizens")
    public List<Citizen> fetchAllProducts() {
        return citizenService.getAllCitizens();
    }


}
