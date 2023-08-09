package bai3.entity;

import bai3.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
    }


    public Intern(String id, String fullName, String email, String employeeType, String phone, int birthDay, int employeeCount, String majors, String semester, String universityName) {
        super(id, fullName, email, employeeType, phone, birthDay, employeeCount);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        System.out.printf("id: %s _ fullName: %s _ email: %s _ employeeType: %s _ phone: %s\n",this.id,this.fullName,this.email,this.employeeType,this.phone);
        System.out.printf("birthDay: %d _ employeeCount: %d\n",this.birthDay,this.employeeCount);
        System.out.printf("majors: %s _ semester: %s _ universityName: %s\n",this.majors,this.semester,this.universityName);
    }

    @Override
    public void inputData(Scanner scanner, List<Employee> employeeList) {
        super.inputData(scanner, employeeList);
        System.out.println("Nhập vào majors");
        this.majors=scanner.nextLine();
        System.out.println("Nhập vào semester");
        this.semester=scanner.nextLine();
        System.out.println("Nhập vào universityName");
        this.universityName=scanner.nextLine();
    }
}
