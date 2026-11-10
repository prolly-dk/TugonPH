package com.barangay.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import java.util.ArrayList;
import java.util.List;



@RestController
public class Controller {
    
    private List<Resident> residents = new ArrayList<>();

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to Tugon: A Barangay Help Desk!";
    }

    @GetMapping("/api/status")
    public String status(){
        return "Barangay Help Desk is ONLINE";
    }

    @GetMapping("/api/resident")
    public String resident(){
        return "Welcome, Resident!";
    }

    //Creates a new resident and returns a success message
    @PostMapping("/api/resident")
    public Resident registerResident(@RequestBody Resident resident) {
        residents.add(resident);

        return resident;
    }

    @GetMapping("/api/residents")
    public List<Resident> getResidents() {
        return residents;
    }
    
}