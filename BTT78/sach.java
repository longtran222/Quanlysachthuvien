package BTT78;

import java.util.ArrayList;
import java.util.Scanner;

class sach {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxb;
    private int soluong;

    public sach() {
    }

    public sach(String masach, String tieude, String tacgia, int namxb, int soluong) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        setnamxb(namxb);
        setsoluong(soluong);
    }

    public String getmasach(){
        return masach;
    }
    public void setmasach(String masach){
        this.masach = masach;
    }

    public String gettieude(){
        return tieude;
    }
    public void settieude(String tieude){
        this.tieude = tieude;
    }

    public String gettacgia(){
        return tacgia;
    }
    public void settacgia(String tacgia){
        this.tacgia = tacgia;
    }

    public int getnamxb(){
        return namxb;
    }

    public void setnamxb(int namxb){
        if(namxb>0&&namxb<=2026)
            this.namxb = namxb;
        else{
            System.out.println("Nam khong hop le");
            this.namxb=2026;
        }
    }

    public int getsoluong(){
        return soluong;
    }
    public void setsoluong(int soluong){
        if(soluong>=0)
            this.soluong = soluong;
        else
            System.out.println("So luong khong hop le");
    }

    public void nhap(Scanner nhap) {
        System.out.print("Nhap ma sach: ");
        setmasach(nhap.nextLine());
        System.out.print("Nhap tieu de: ");
        settieude(nhap.nextLine());
        System.out.print("Nhap tac gia: ");
        settacgia(nhap.nextLine());
        System.out.print("Nhap nam xuat ban: ");
        setnamxb(Integer.parseInt(nhap.nextLine()));
        System.out.print("Nhap so luong: ");
        setsoluong(Integer.parseInt(nhap.nextLine()));
    }

    public void hienthi() {
        System.out.println("Ma sach: " +getmasach());
        System.out.println("Tieu de: " +gettieude());
        System.out.println("Tac gia: " +gettacgia());
        System.out.println("Nam xuat ban: " +getnamxb());
        System.out.println("So luong: " +getsoluong());
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