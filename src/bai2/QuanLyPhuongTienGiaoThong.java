package bai2;

import java.util.Scanner;

public class QuanLyPhuongTienGiaoThong {
    static Scanner scanner = new Scanner(System.in);
    static Oto[] oto = new Oto[100];
    static XeMay[] xemay = new XeMay[100];
    static XeTai[] xetai = new XeTai[100];
    static int number = 0;

    public static void main(String[] args) {
        do {
            System.out.println("*****SERVICE*****" +
                    "1. ADD" +
                    "2. Delete" +
                    "3. sort allow sale" +
                    "4. search a brand " +
                    "5. search a color" +
                    "6. Exit");
            System.out.print("enter a number");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhap ten phuong tien muon them");
                    String name = scanner.nextLine();
                    QuanLyPhuongTienGiaoThong.add(name);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);

            }
        } while (true);
    }

    public static void add(String name) {
        System.out.println("nhap vao so luong phuong tien muon them");
        int n = Integer.parseInt(scanner.nextLine());
        switch (name) {
            case "oto":
                for (int i = 0; i < n; i++) {

                }
                break;
            case "xemay":
                break;
            case "xetai":
                break;

        }
    }
}
