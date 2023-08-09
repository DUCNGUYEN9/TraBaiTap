package bai3.entity;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Experience extends Employee {
    private float expInYear;
    private String proSkill;

    public Experience() {
    }


    public Experience(String id, String fullName, String email, String employeeType, String phone, int birthDay, int employeeCount, float expInYear, String proSkill) {
        super(id, fullName, email, employeeType, phone, birthDay, employeeCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public float getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(float expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.printf("id: %s _ fullName: %s _ email: %s _ employeeType: %s _ phone: %s\n", getId(), getFullName(), getEmail(), getEmployeeType(), getPhone());
        System.out.printf("birthDay: %d _ employeeCount: %d\n", getBirthDay(), getEmployeeCount());
        System.out.printf("expInYear: %.1f _ proSkill: %s\n", this.expInYear, this.proSkill);

    }

    @Override
    public void inputData(Scanner scanner, List<Employee> employeeList) {
        super.inputData(scanner, employeeList);
        System.out.println("Nhập vào expInYear");
        this.expInYear=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào proSkill");
        this.proSkill=scanner.nextLine();
    }


    //    @Override
//    public void inputData(Scanner scanner, List<Employee> employeeList) {
//        System.out.println("Nhập vào ID");
//        boolean check = true;
//        do {
//            setId(scanner.nextLine());
//            boolean isExist = false;
//            for (int i = 0; i < employeeList.size(); i++) {
//                if (employeeList.get(i).getId().contains(getId())) {
//                    isExist = true;
//                    break;
//                }
//            }
//            if (!isExist) {
//                System.err.println("mã id bị trùng vui long nhập lại");
//            }
//        } while (check);
//        System.out.println("Nhập vào email");
//
//        do {
//            setFullName(scanner.nextLine());
//            if (getFullName().length() > 5 && getFullName().length() < 50) {
//                break;
//            } else {
//                System.err.println("Tên phải trong khoảng 6 - 50");
//            }
//
//        } while (check);
//        System.out.println("Nhập vào email");
//        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//        do {
//            setEmail(scanner.nextLine());
//            if (Pattern.matches(emailRegex, getEmail())) {
//                break;
//            } else {
//                System.err.println("Email ban nhap khong dung dinh dang");
//            }
//
//        } while (check);
//        System.out.println("Nhập vào employeeType");
//        do {
//            int number = Integer.parseInt(scanner.nextLine());
//            switch (number) {
//                case 0:
//                    setEmployeeType("Experience");
//                    break;
//                case 1:
//                    setEmployeeType("Fresher");
//                    break;
//                default:
//                    setEmployeeType("Intern");
//                    break;
//            }
//        } while (check);
//        System.out.println("Nhập vào phone");
//        String phonRegex="^\\+?[1-9][0-9]{7,14}$";
//        do {
//            setPhone(scanner.nextLine());
//            if (Pattern.matches(phonRegex, getPhone())) {
//                break;
//            } else {
//                System.err.println("phone ban nhap khong dung dinh dang");
//            }
//
//        } while (check);
//        System.out.println("Nhập vào birthDay");
//        do {
//            setBirthDay(Integer.parseInt(scanner.nextLine()));
//            if (getBirthDay()<2005 &&getBirthDay()>1950) {
//                break;
//            } else {
//                System.err.println("birthday ban nhap khong dung");
//            }
//
//        } while (check);
//        System.out.println("Nhập vào expInYear");
//        setExpInYear(Integer.parseInt(scanner.nextLine()));
//        System.out.println("Nhập vào proSkill");
//        setProSkill(scanner.nextLine());
//
//    }
}
