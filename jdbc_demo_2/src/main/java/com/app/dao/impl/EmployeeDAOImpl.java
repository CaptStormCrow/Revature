package com.app.dao.impl;

import com.app.BusinessException;
import com.app.dao.EmployeeDAO;
import com.app.dbutil.PostgresConnection;
import com.app.model.Employee;

import java.sql.*;

public class EmployeeDAOImpl  implements EmployeeDAO {

    @Override
    public Employee createEmployee(Employee employee) throws SQLException {

        Connection connection= PostgresConnection.getConnection();
        String sql = "INSERT INTO employee_schema.employee2\n" +
                "(\"name\", city, contact, gender, age, deptid)\n" +
                "VALUES(?, ?, ?, ?, ?, ?);\n";
        PreparedStatement preparedStatement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        PreparedStatement.setString(1,employee.getName());
        PreparedStatement.setInt(1,employee.getAge());
        PreparedStatement.setLong(1,employee.getContact());
        PreparedStatement.setString(1,employee.getCity());
        PreparedStatement.setString(1,employee.getGender());
        PreparedStatement.setInt(1,employee.getDepartment().getDeptid());

        int c=preparedStatement.executeUpdate();
        if(c==1){
            ResultSet resultSet=preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                employee.setId(resultSet.getInt(1));
            }
        }else{
            throw new BusinessException("Failure in Registeration. Please Retry");
        }
        return null;
    }

    @Override
    public Employee createEmployee() {
        return null;
    }
}
