package org.LearningHibernate.JPAHibernateApproach.Course.jdbc;

public class Course {
    private long id;
    private String EmployeeName;
    private String EmployeeSalary;
    public Course(){

    }
    public Course(long id, String employeeName, String employeeSalary) {
        this.id = id;
        EmployeeName = employeeName;
        EmployeeSalary = employeeSalary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeSalary='" + EmployeeSalary + '\'' +
                '}';
    }
}
