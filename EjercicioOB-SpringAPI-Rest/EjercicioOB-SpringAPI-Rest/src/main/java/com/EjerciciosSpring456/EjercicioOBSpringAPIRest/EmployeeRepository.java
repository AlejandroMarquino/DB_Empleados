package com.EjerciciosSpring456.EjercicioOBSpringAPIRest;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
