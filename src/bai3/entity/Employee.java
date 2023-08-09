package bai3.entity;

import bai3.entity.Certificate;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Employee {
    protected String id, fullName, email, phone, employeeType;
    protected int birthDay, employeeCount;
    protected String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public Employee() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Employee(String id, String fullName, String email, String employeeType, String phone, int birthDay, int employeeCount) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.employeeType = employeeType;
        this.phone = phone;
        this.birthDay = birthDay;
        this.employeeCount = employeeCount;
    }

    abstract void showInfo();

    public void inputData(Scanner scanner, List<Employee> employeeList) {
        System.out.println("Nhập vào ID");
        boolean check = true;
        do {
            this.id = scanner.nextLine();
            if (employeeList.size() > 0) {
                boolean isExist = false;
                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getId().equals(this.id)) {
                        isExist = true;
                        break;
                    }
                }
                if (isExist) {
                    System.err.println("mã id bị trùng vui long nhập lại");
                }else {
                    break;
                }
            } else {
                break;
            }
        } while (check);
        System.out.println("Nhập vào ten");

        do {
            this.fullName = scanner.nextLine();
            if (this.fullName.length() > 5 && this.fullName.length() < 50) {
                break;
            } else {
                System.err.println("Tên phải trong khoảng 6 - 50");
            }

        } while (check);
        System.out.println("Nhập vào email");
        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        do {
            this.email = scanner.nextLine();
            if (Pattern.matches(emailRegex, this.email)) {
                break;
            } else {
                System.err.println("Email ban nhap khong dung dinh dang");
            }

        } while (check);
        System.out.println("Nhập vào employeeType");
        do {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                this.employeeType = "EXPERIENCE";
                break;
            } else if (number == 1) {
                this.employeeType = "FRESHER";
                break;
            } else {
                this.employeeType = "INTERN";
                break;
            }
        } while (check);
        System.out.println("Nhập vào phone");
        String phonRegex = "[0-9]{10}";
        do {
            this.phone = scanner.nextLine();
            if (Pattern.matches(phonRegex, this.phone)) {
                break;
            } else {
                System.err.println("phone ban nhap khong dung dinh dang");
            }

        } while (check);
        System.out.println("Nhập vào birthDay");
        do {
            setBirthDay(Integer.parseInt(scanner.nextLine()));
            if (getBirthDay() < 2005 && getBirthDay() > 1950) {
                break;
            } else {
                System.err.println("birthday ban nhap khong dung");
            }

        } while (check);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", birthDay=" + birthDay +
                ", employeeCount=" + employeeCount +
                ", certificate='" + certificate + '\'' +
                '}';
    }
}
