package com.example.emppayrollapp.repository;

import com.example.emppayrollapp.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<EmployeeEntity, Long> {

}
