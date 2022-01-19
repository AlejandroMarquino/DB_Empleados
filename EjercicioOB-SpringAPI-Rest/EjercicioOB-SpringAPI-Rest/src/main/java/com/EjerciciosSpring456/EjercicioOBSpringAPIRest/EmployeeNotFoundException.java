package com.EjerciciosSpring456.EjercicioOBSpringAPIRest;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
