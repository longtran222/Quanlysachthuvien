package BTT9;

import java.util.Scanner;

public class sachthamkhao extends sach{
    public double thue;

    public sachthamkhao() {
        super();
    }

    public sachthamkhao(String masach, String ngaynhap, double dongia, int sl, String nhaxuatban, double thue){
        super(masach, ngaynhap, dongia, sl, nhaxuatban);
        this.thue = thue;
    }

    @Override 
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.println("Thue: ");
        thue= Double.parseDouble(sc.nextLine());
    }

    public double thanhtien(){
        return sl*dongia+thue;
    }

    @Override
    public void inthongtinsach() {
        super.inthongtinsach();
        System.out.println("Thue: " + thue+ "| Thanh tien: " + thanhtien());
    }
}
