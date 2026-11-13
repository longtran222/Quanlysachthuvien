package BTT78;

import java.util.ArrayList;
import java.util.Scanner;

class sach {
    String masach;
    String tieude;
    String tacgia;
    int namxb;
    int soluong;

    public sach() {
    }

    public sach(String ms, String td, String tg, int namxb, int sl) {
        this.masach = ms;
        this.tieude = td;
        this.tacgia = tg;
        this.namxb = namxb;
        this.soluong = sl;
    }

    public void nhap(Scanner nhap) {
        System.out.print("Nhap ma sach: ");
        masach = nhap.nextLine();
        System.out.print("Nhap tieu de: ");
        tieude = nhap.nextLine();
        System.out.print("Nhap tac gia: ");
        tacgia = nhap.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namxb = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhap so luong: ");
        soluong = Integer.parseInt(nhap.nextLine());
    }

    public void hienthi() {
        System.out.println("Ma sach: " +masach);
        System.out.println("Tieu de: " +tieude);
        System.out.println("Tac gia: " +tacgia);
        System.out.println("Nam xuat ban: " +namxb);
        System.out.println("So luong: " +soluong);
    }

    public static void nhapDanhSach(ArrayList<sach> danhsach, Scanner nhap) {
        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(nhap.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin cuon sach thu " + (i + 1));
            sach s = new sach();
            s.nhap(nhap);
            danhsach.add(s);
        }
    }
    
    public static void hienThiDanhSach(ArrayList<sach> danhsach) {
        System.out.println("\n-----Sach trong kho-----");
        for (int i = 0; i < danhsach.size(); i++) {
            sach s = danhsach.get(i); 
            s.hienthi(); 
            System.out.println("-------------------------");
        }
    }
}