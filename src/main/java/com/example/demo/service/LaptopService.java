package com.example.demo.service;

import com.example.demo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop()
    {
        System.out.println("method called");
    }
    public boolean isgood(Laptop laptop)
    {
        return true;
    }
}
