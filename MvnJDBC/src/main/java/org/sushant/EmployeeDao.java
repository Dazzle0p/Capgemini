package org.sushant;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.model.Employee;
public class EmployeeDao {


    public boolean addEmployee(Employee emp){
        String sql = "insert into employee Values(?,?,?,?,?,?,?,?,?,?)";

        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,emp.getId());
            statement.setString(2,emp.getFirstname());
            statement.setString(3, emp.getLastname());
            statement.setString(4, emp.getEmail());
            statement.setString(5, emp.getPhone_number());
            statement.setString(6, emp.getHire_date());
            statement.setString(7, emp.getJob_title());
            statement.setDouble(8, emp.getSalary());
            statement.setDouble(9, emp.getManager_id());
            statement.setString(10, emp.getDepartment());

            int rows = statement.executeUpdate();
            return rows > 0;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public boolean deleteEmployeeById(int id){
        String sql = "Delete from employee where employee_id=?";
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            int rows = ps.executeUpdate();
            return  rows > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Employee> getAllEmployees() throws SQLException {

        List<Employee> employees = new ArrayList<>();

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from employee")) {

            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getInt("employee_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone_number"),
                        resultSet.getString("hire_date"),
                        resultSet.getString("job_title"),
                        resultSet.getDouble("salary"),
                        resultSet.getDouble("manager_id"),
                        resultSet.getString("department_id")
                ));
            }
        }

        return employees;
    }

    public Employee getEmpById(int id) throws SQLException {

        String sql = "SELECT * FROM employee WHERE employee_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return new Employee(
                            rs.getInt("employee_id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("email"),
                            rs.getString("phone_number"),
                            rs.getString("hire_date"),
                            rs.getString("job_title"),
                            rs.getDouble("salary"),
                            rs.getDouble("manager_id"),
                            rs.getString("department_id")
                    );
                }
            }
        }

        return null;
    }

    public double getTotalSalary() throws SQLException {
        String sql = "SELECT SUM(salary) FROM employee";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getDouble(1);
            }
        }
        return 0;
    }

    public Map<String, Integer> getDepartmentEmployeeCount() throws SQLException {
        String sql = """
                SELECT d.department_name, COUNT(e.employee_id)
                FROM department d
                LEFT JOIN employee e
                ON d.department_id = e.department_id
                GROUP BY d.department_name
                """;

        Map<String, Integer> map = new HashMap<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                map.put(rs.getString(1), rs.getInt(2));
            }
        }
        return map;
    }

    public Employee getSeniorMostEmp() throws SQLException{
        String sql = "SELECT * FROM employee ORDER BY hire_date ASC LIMIT 1";
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                return mapEmployee(resultSet);
            }
        }
        return null;
    }

    public Map<String, String > getEmployeeDuration() throws SQLException{
        String sql = " SELECT first_name, last_name, TIMESTAMPDIFF(MONTH, hire_date, CURDATE()) As Month, TIMESTAMPDIFF(DAY, hire_date, CURDATE() ) As Days from employee ";
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            Map<String, String> map = new HashMap<>();
            while (resultSet.next())
            {
                map.put(resultSet.getString("first_name") + " " + resultSet.getString("last_name"), resultSet.getString(3) + "Months" + " " + resultSet.getString(4) + "Days");
            }
            return  map;
        }
    }

    private Employee mapEmployee(ResultSet rs) throws SQLException {
        return new Employee(
                rs.getInt("employee_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getString("phone_number"),
                rs.getString("hire_date"),
                rs.getString("job_title"),
                rs.getDouble("salary"),
                rs.getDouble("manager_id"),
                rs.getString("department_id")
        );
    }
}