package com.example.demo.models;

import java.sql.Date;

public class Employee {
    private int id;
    private String name;
    private String job;
    private int manager;
    private Date hireDate;
    private double salary;
    private int comission;
    private int department_number;

    public Employee(int id, String name, String job, int manager, Date hireDate, double salary, int comission, int department_number) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.hireDate = hireDate;
        this.salary = salary;
        this.comission = comission;
        this.department_number = department_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getComission() {
        return comission;
    }

    public void setComission(int comission) {
        this.comission = comission;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", manager=" + manager +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", comission=" + comission +
                ", department_number=" + department_number +
                '}';
    }
}
