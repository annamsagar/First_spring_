package com.example.demo.service;

import com.example.demo.LaptopRepository;
import com.example.demo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laprepo;
    public void addLaptop(Laptop lap)
    {
        laprepo.save(lap);
    }
    public boolean isgood(Laptop laptop)
    {
        return true;
    }
}
