package com.example.projectrevise.service;

import com.example.projectrevise.model.Student;
import com.example.projectrevise.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Service {
    @Autowired
    Repository repository;
//List<Student> list=new ArrayList<>();
    public void adddata(@RequestBody Student obj)
    {
        repository.save(obj);
    }

    public void showdata() {

        repository.findAll();
    }
    public void delete(@RequestParam int rollno)
    {
        repository.deleteById(rollno);

    }
    public Optional<Student> getstudentbyrollno(int rollno )
    {
        return repository.findById(rollno);
    }
}
