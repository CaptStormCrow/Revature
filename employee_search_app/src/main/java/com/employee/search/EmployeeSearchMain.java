package com.employee.search;

import com.employee.search.exception.BusinessException;
import com.employee.search.model.Employee;
import com.employee.search.service.EmployeeSearchService;
import com.employee.search.service.impl.EmployeeSearchServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeSearchMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Vinay's Employee Search App V1.0");
        Scanner scanner=new Scanner(System.in);
        EmployeeSearchService employeeSearchService=new EmployeeSearchServiceImpl();
        int ch=0;
        do {
            System.out.println("Search Menu");
            System.out.println("============================");
            System.out.println("1)By Id");
            System.out.println("2)By Name");
            System.out.println("3)By Age");
            System.out.println("4)By City");
            System.out.println("5)By Gender");
            System.out.println("6)By Department Name");
            System.out.println("7)By Contact Number");
            System.out.println("8)Get All Employees");
            System.out.println("9)EXIT");
            System.out.println("Enter your choice(1-9) : ");
            try {
                ch = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){}
            switch (ch){
                case 1:
                    System.out.println("Enter Employee Id to get Employee Details");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        Employee employee=employeeSearchService.getEmployeeById(id);
                        if(employee!=null){
                            System.out.println("Employee with id "+id+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException e){
                        System.out.println("Id should be integer only");
                    } catch (BusinessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter Employee Name to get all employees of that name: ");
                    String name=scanner.nextLine();
                    try {
                        List<Employee> employeeList=employeeSearchService.getEmployeesByName(name);
                        if(employeeList!=null && employeeList.size()>0){
                            System.out.println("We have a total of "+employeeList.size()+" employees in DB named "+name+"\n... Printing the details below for "+name);
                            for(Employee e:employeeList){
                                System.out.println(e);
                            }
                        }
                    } catch (BusinessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Enter gender to get all employees of that gender category (M-Male,F-Female,O-Others) enter M or F or O");
                    String gender=scanner.nextLine();
                    try {
                        List<Employee> employeeList=employeeSearchService.getEmployeesByGender(gender);
                        if(employeeList!=null && employeeList.size()>0){
                            System.out.println("We have total "+employeeList.size()+" no of employees in DB... Printing the details below for the gender "+gender);
                            for(Employee e:employeeList){
                                System.out.println(e);
                            }
                        }
                    } catch (BusinessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    try {
                        List<Employee> employeeList=employeeSearchService.getAllEmployees();
                        if(employeeList!=null && employeeList.size()>0){
                            System.out.println("We have total "+employeeList.size()+" no of employees in DB... Printing the details below");
                            for(Employee e:employeeList){
                                System.out.println(e);
                            }
                        }
                    } catch (BusinessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    System.out.println("Thankq for using the App :) ");
                    break;
                default:
                    System.out.println("Invalid Input!!!!!! Your choice should be between 1-9 only........");

            }
        }while (ch!=9);
    }
}
