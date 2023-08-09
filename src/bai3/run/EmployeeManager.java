package bai3.run;

import bai3.entity.Employee;
import bai3.entity.Experience;
import bai3.entity.Fresher;
import bai3.entity.Intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    static List<Employee> employeeList = new ArrayList<>();
//    static Experience experience = new Experience();
//    static Fresher fresher = new Fresher();
//    static Intern intern = new Intern();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(
                    "*********MENU*********\n" +
                            "0. Hiện thị tất ca nhan vien\n" +
                            "1. Thêm\n" +
                            "2. Sửa (hãy nhập ID)\n" +
                            "3. Xóa (hãy nhập ID)\n" +
                            "4. Tìm tất cả các nhân viên intern\n" +
                            "5. Tìm tất cả các nhân viên fresher\n" +
                            "6. Tìm tất cả các nhân viên experience\n" +
                            "7. Thoát");
            System.out.print("Sự lụa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    EmployeeManager.diplayData();
                    break;
                case 1:
                    EmployeeManager.addData(scanner);
                    break;
                case 2:
                    EmployeeManager.editEmployee(scanner);
                    break;
                case 3:
                    EmployeeManager.deleteEmployee(scanner);
                    break;
                case 4:
                    EmployeeManager.searchIntern();
                    break;
                case 5:
                    EmployeeManager.searchFresher();
                    break;
                case 6:
                    EmployeeManager.searchExperience();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập trong khoảng 1 - 7");
            }
        } while (true);

    }

    public static void diplayData() {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employeeList.get(i).getEmployeeType().equals("EXPERIENCE")) {
                Experience experience1 = (Experience) employee;
                experience1.showInfo();
            }
            if (employeeList.get(i).getEmployeeType().equals("FRESHER")) {
                Fresher fresher1 = (Fresher) employee;
                fresher1.showInfo();
            }
            if (employeeList.get(i).getEmployeeType().equals("INTERN")) {
                Intern intern1 = (Intern) employee;
                intern1.showInfo();
            }
        }
    }
    public static void addData(Scanner scanner) {
        System.out.println(
                "**Hãy chọn loại nhân viên** \n" +
                        "0. experience\n" +
                        "1. fresher\n" +
                        "2. intern");
        System.out.print("Sự lụa chọn của bạn là: ");
        int numberType = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số lượng nhân viên bạn muốn thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (numberType == 0) {
                Experience experience = new Experience();
                experience.inputData(scanner, employeeList);
                employeeList.add(experience);
            } else if (numberType == 1) {
                Fresher fresher = new Fresher();
                fresher.inputData(scanner, employeeList);
                employeeList.add(fresher);
            } else {
                Intern intern = new Intern();
                intern.inputData(scanner, employeeList);
                employeeList.add(intern);
            }
        }
    }
    public static void editEmployee(Scanner scanner) {
        System.out.println("Nhập id bạn muốn sửa");
        String editId = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(editId)) {
                isExits = true;
                System.out.println(
                        "**Hãy chọn loại nhân viên** \n" +
                                "0. experience\n" +
                                "1. fresher\n" +
                                "2. intern");
                System.out.print("Sự lụa chọn của bạn là: ");
                int numberType = Integer.parseInt(scanner.nextLine());
                if (numberType == 0) {
                    Experience experience = new Experience();
                    experience.inputData(scanner, employeeList);
                    employeeList.set(i, experience);
                } else if (numberType == 1) {
                    Fresher fresher = new Fresher();
                    fresher.inputData(scanner, employeeList);
                    employeeList.set(i, fresher);
                } else {
                    Intern intern = new Intern();
                    intern.inputData(scanner, employeeList);
                    employeeList.set(i, intern);
                }
                break;
            }
        }
        if (!isExits) {
            System.err.println("mã id bạn nhập không tồn tại ");
        }
    }
    public static void deleteEmployee(Scanner scanner){
            System.out.print("Nhập id bạn muốn xoa: ");
            String editId = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(editId)) {
                isExits = true;
               employeeList.remove(i);
               break;

            }
        }
        if (!isExits) {
            System.err.println("mã id bạn nhập không tồn ");
        }else {
            System.out.println("Đã xóa xong!");
        }
    }
    public static void searchIntern(){
        for (int i = 0; i < employeeList.size(); i++) {
                Employee employee2=employeeList.get(i);
            if (employeeList.get(i).getEmployeeType().equals("INTERN")) {
                Intern intern2=(Intern) employee2;
                intern2.showInfo();
            }

        }

    }
    public static void searchFresher(){
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee2=employeeList.get(i);

            if (employeeList.get(i).getEmployeeType().equals("FRESHER")) {
                Fresher fresher2=(Fresher) employee2;
                fresher2.showInfo();
            }

        }

    }
    public static void searchExperience(){
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee2=employeeList.get(i);

            if (employeeList.get(i).getEmployeeType().equals("EXPERIENCE")) {
                Experience experience2=(Experience) employee2;
                experience2.showInfo();
            }
        }

    }
}
