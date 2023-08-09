package bai2;

import java.util.Scanner;

public class Oto  extends PhuongTienGiaoThong implements IPhuongTien{
    private int choNgoi;
    private String kieuDongCo;

    public Oto() {
    }

    public Oto(int choNgoi, String kieuDongCo) {
        this.choNgoi = choNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public Oto(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, int choNgoi, String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.choNgoi = choNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("enter a ID: ");
        setId(scanner.nextLine());
        System.out.println("enter a brand: ");
        System.out.println("enter a ID: ");
        System.out.println("enter a ID: ");
        System.out.println("enter a ID: ");
        System.out.println("enter a ID: ");
        System.out.println("enter a ID: ");
    }
}
