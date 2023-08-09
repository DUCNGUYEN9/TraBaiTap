package bai3.entity;

import java.util.Scanner;

public enum employeeTypeEnum {
    EXPERIENCE(0), FRESHER(1), INTERN(2);
    public int value;

    employeeTypeEnum(int i) {
        this.value = i;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

    }
    public static String valueEnum(Scanner scanner){
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 0:
                return "Experience";
            case 1:
                return "Fresher";
            default:
                return "Intern";
        }
    }

}
