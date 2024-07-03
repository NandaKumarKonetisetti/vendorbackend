package com.example.vendor.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vendor.entities.Employee;
import com.example.vendor.model.Vendor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class EmployeeService {
	
	
//	@PersistenceContext(unitName = "sql")
//	private EntityManager em;
	
	public void saveEmployee(Employee employee) {
		try {
			com.example.vendor.entities.Employee employee1 = new com.example.vendor.entities.Employee();
			employee1.setName(employee.getName());
			employee1.setEmail(employee.getEmail());
			employee1.setCtc(employee.getCtc());
			employee1.setDesignation(employee.getDesignation());
			employee1.setRole(0);
			
//			em.persist(employee1);
//			em.flush();	
		}
		catch (Exception e) {
			log.error("Getting Error while saving employee details "+e.getMessage(),e);
		}
	}
	
	
//    public Collection<com.example.vendor.model.Employee> getAllEmployees() {
//        Collection<com.example.vendor.model.Employee> employeeData = new ArrayList<>();
//        
//        try {
//            // Query to fetch employees from database
//            List<Employee> employees =
////            		em.createQuery("from Employee order by name asc", Employee.class)
////                                         .setHint("org.hibernate.readOnly", true)
////                                         .getResultList();
//
//            // Mapping Employee entities to model Employee objects
//            for (Employee employee : employees) {
//                com.example.vendor.model.Employee dataEmployee = new com.example.vendor.model.Employee();
//                dataEmployee.setName(employee.getName());
//                dataEmployee.setCtc(employee.getCtc());
//                dataEmployee.setDesignation(employee.getDesignation());
//                dataEmployee.setEmail(employee.getEmail());
//              
//                employeeData.add(dataEmployee);
//            }
//            
//        } catch (Exception e) {
//            log.error("Error while fetching employees ", e.getMessage(), e);
//           
//        }
//
//        return employeeData;
//    }
	public Collection<com.example.vendor.model.Employee> getAllEmployees() {
        List<com.example.vendor.model.Employee> employees = new ArrayList<>();
        employees.add(new com.example.vendor.model.Employee("John Doe", "Software Engineer", "100000", "john.doe@example.com"));
        employees.add(new com.example.vendor.model.Employee("Jane Smith", "Product Manager", "120000", "jane.smith@example.com"));
        employees.add(new com.example.vendor.model.Employee("Michael Johnson", "UI/UX Designer", "90000", "michael.johnson@example.com"));
        employees.add(new com.example.vendor.model.Employee("John Doe", "Software Engineer", "100000", "john.doe@example.com"));
        employees.add(new com.example.vendor.model.Employee("Jane Smith", "Product Manager", "120000", "jane.smith@example.com"));
        employees.add(new com.example.vendor.model.Employee("Michael Johnson", "UI/UX Designer", "90000", "michael.johnson@example.com"));
       

        return employees;
    }

}
