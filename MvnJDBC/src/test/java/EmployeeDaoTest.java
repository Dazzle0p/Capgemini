import org.junit.jupiter.api.Test;
import org.sushant.EmployeeDao;
import org.model.Employee;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoTest {

    @Test
    void testGetAllEmployees() throws Exception {

        EmployeeDao dao = new EmployeeDao();
        List<Employee> employees = dao.getAllEmployees();

        assertNotNull(employees);
        assertFalse(employees.isEmpty());

        Employee first = employees.get(0);

        assertNotNull(first.getFirstname());
        assertTrue(first.getSalary() > 0);
    }

    @Test
    void testGetEmployeeById() throws Exception{
        EmployeeDao dao = new EmployeeDao();
        Employee emp = dao.getEmpById(200);

        assertNotNull(emp);
        assertEquals(200,emp.getId());
    }

    @Test
    void testSeniorMostEmp() throws Exception{
        EmployeeDao dao = new EmployeeDao();
        Employee emp = dao.getSeniorMostEmp();
        assertNotNull(emp);
    }

    @Test
    void testGetEmployeeDuration() throws Exception{
        EmployeeDao dao = new EmployeeDao();
        Map<String,String> map = dao.getEmployeeDuration();
        assertNotNull(map);
    }

    @Test
    void  testAddEmployee() throws Exception{
        EmployeeDao dao = new EmployeeDao();

        Employee emp = new Employee(
                105,
                "Sushant",
                "Patil",
                "sushant@gmail.com",
                "9876543210",
                "2024-01-10",
                "Software Engineer",
                60000,
                101,
                "30"
        );
        boolean test = dao.addEmployee(emp);
        assertTrue(test);
    }

    @Test
    void testDeleteEmployeeById() throws SQLException{
        EmployeeDao dao = new EmployeeDao();
        boolean res = dao.deleteEmployeeById(105);
        assertTrue(res);
    }
}