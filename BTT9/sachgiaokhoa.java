package BTT9;

import java.util.Scanner;

public class sachgiaokhoa extends sach{
    public String tinhtrang;

    public sachgiaokhoa(){
        super();
    }

    public sachgiaokhoa(String masach, String ngaynhap, double dongia, int sl, String nhaxuatban, String tinhtrang){
        super(masach, ngaynhap, dongia, sl, nhaxuatban);
        this.tinhtrang = tinhtrang;
    }

    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.println("Tinh trang (moi / cu): ");
        tinhtrang= sc.nextLine();
    }

    public double thanhtien(){
        if ("moi".equalsIgnoreCase(tinhtrang)){
            return sl * dongia;
        }
        else
            return sl * dongia * 0.5;
    }

    @Override
    public void inthongtinsach(){
        super.inthongtinsach();
        System.out.println("Tinh trang: " + tinhtrang + "| Thanh tien: " + thanhtien());
    }
}
