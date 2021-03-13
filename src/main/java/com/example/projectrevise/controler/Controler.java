package com.example.projectrevise.controler;

import com.example.projectrevise.model.Student;
import com.example.projectrevise.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controler {
    @Autowired
    Service service;
    @PostMapping("/poststudent")
    public void adddata(@RequestBody Student obj)
    {
        service.adddata(obj);
    }
    @RequestMapping("/getstu")
    public void showdata()
    {
         service.showdata();
    }
    @DeleteMapping("/delstu")
    public void delete(@RequestParam int rollno)
    {
        service.delete(rollno);
    }
    @GetMapping("/join")
    public Optional<Student> getstudent(@RequestParam int rollno)
    {
        return this.service.getstudentbyrollno(rollno);
    }

}
