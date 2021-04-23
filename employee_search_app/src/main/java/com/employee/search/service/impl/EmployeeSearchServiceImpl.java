package com.employee.search.service.impl;

import com.employee.search.dao.EmployeeSearchDAO;
import com.employee.search.dao.impl.EmployeeSearchDAOImpl;
import com.employee.search.exception.BusinessException;
import com.employee.search.model.Employee;
import com.employee.search.service.EmployeeSearchService;

import java.util.List;

public class EmployeeSearchServiceImpl implements EmployeeSearchService {
   private EmployeeSearchDAO employeeSearchDAO=new EmployeeSearchDAOImpl();
    @Override
    public Employee getEmployeeById(int id) throws BusinessException {
       Employee employee=null;
        if(id<=0 || id>10000){
            throw new BusinessException("No employee in the system with the id : "+id);
        }else {
            //Code here for DAO
            employee=employeeSearchDAO.getEmployeeById(id);
        }
        return employee;
    }

    @Override
    public Employee getEmployeeByContact(long contact) throws BusinessException {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByName(String name) throws BusinessException {
        List<Employee> employeeList=null;
        if(name!=null && name.matches("[a-zA-Z]{5}")){
            employeeList=employeeSearchDAO.getEmployeesByName(name);
        }else{
            throw new BusinessException("Invalid name "+name);
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByCityName(String city) throws BusinessException {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) throws BusinessException {
        List<Employee> employeeList=null;
        if(gender!=null && gender.matches("[mMfFoO]{1}")){
            employeeList=employeeSearchDAO.getEmployeesByGender(gender);
        }else{
            throw new BusinessException("Invalid gender "+gender);
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String name) throws BusinessException {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByAge(int age) throws BusinessException {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() throws BusinessException {
        return employeeSearchDAO.getAllEmployees();
    }
}
