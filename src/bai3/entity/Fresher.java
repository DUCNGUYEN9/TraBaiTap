package bai3.entity;

import bai3.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class Fresher extends Employee {
    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }



    public Fresher(String id, String fullName, String email, String employeeType, String phone, int birthDay, int employeeCount, int graduationDate, String graduationRank, String education) {
        super(id, fullName, email, employeeType, phone, birthDay, employeeCount);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        System.out.printf("id: %s _ fullName: %s _ email: %s _ employeeType: %s _ phone: %s\n",this.id,this.fullName,this.email,this.employeeType,this.phone);
        System.out.printf("birthDay: %d _ employeeCount: %d\n",this.birthDay,this.employeeCount);
        System.out.printf("graduationDate: %d - graduationRank: %s _ Education: %s\n",this.graduationDate,this.graduationDate,this.education);

    }

    @Override
    public void inputData(Scanner scanner, List<Employee> employeeList) {
        super.inputData(scanner, employeeList);
        System.out.println("Nhập vào graduationDate");
        this.graduationDate=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào graduationRank");
        this.graduationRank=scanner.nextLine();
        System.out.println("Nhập vào Education");
        this.education=scanner.nextLine();
    }
}
