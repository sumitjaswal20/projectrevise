package com.example.projectrevise.repository;

import com.example.projectrevise.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface Repository extends JpaRepository<Student,Integer> {



}
