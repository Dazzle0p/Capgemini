package org.model;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone_number;
    private String hire_date;
    private String job_title;
    private double salary;
    private double manager_id;
    private String department_id;

    public Employee(int id, String firstname, String lastname, String email, String phone_number, String hire_date, String job_title, double salary,double manager_id, String department_id) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.job_title = job_title;
        this.salary = salary;
        this.manager_id = manager_id;
        this.department_id = department_id;
    }

    public Employee() {
        System.out.println("Employee Not Found");
    }

    // getters
    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getEmail() {return email;}
    public String getPhone_number() {return phone_number;}
    public String getHire_date() {return hire_date;}
    public String getJob_title() {return job_title;}
    public double getSalary() { return salary; }
    public double getManager_id() {return manager_id; }
    public String getDepartment() { return department_id; }

}