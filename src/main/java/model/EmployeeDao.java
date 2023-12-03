package model;

import org.hibernate.annotations.processing.Find;

import java.util.List;

public interface EmployeeDao {

    @Find
    List<Employee> findAll();
}
