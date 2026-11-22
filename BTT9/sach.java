package BTT9;

import java.util.Scanner;

public class sach{
    private String masach;
    protected String ngaynhap;
    protected double dongia;
    protected int sl;
    protected String nhaxuatban;

    public sach(){
    }

    public sach(String masach, String ngaynhap, double dongia, int sl, String nhaxuatban){
        this.masach = masach;
        this.ngaynhap = ngaynhap;
        this.dongia = dongia;
        this.sl = sl;
        this.nhaxuatban = nhaxuatban;
    }

    public double getDongia(){
        return dongia;
    }

    public String getNhaxuatban(){
        return nhaxuatban;
    }
    
    public void nhap(Scanner sc) {
        System.out.print("Ma sach: ");
        masach = sc.nextLine();
        System.out.print("Ngay nhap: ");
        ngaynhap = sc.nextLine();
        System.out.print("Don gia: ");
        dongia = Double.parseDouble(sc.nextLine());
        System.out.print("So luong: ");
        sl = Integer.parseInt(sc.nextLine());
        System.out.print("NXB: ");
        nhaxuatban = sc.nextLine();
    }

    public void inthongtinsach(){
        System.out.println("Ma sach: " + masach + "| Ngay nhap: " + ngaynhap +"| Don gia: " + dongia + "| So luong: " + sl + "| NXB: " + nhaxuatban);
    }
}
