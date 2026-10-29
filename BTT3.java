import java.util.Scanner;

public class BTT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- BAI 1 TUAN 3 ---
        System.out.println("=== NHAP THONG TIN SACH ===");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();

        // --- BAI 4 TUAN 4 ---
        System.out.println("\n--- CHON LOAI SACH ---");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int chonLoai = scanner.nextInt();
        
        String tenLoaiSach = "";
        switch (chonLoai) {
            case 1:
                tenLoaiSach = "Sach giao khoa";
                break;
            case 2:
                tenLoaiSach = "Sach tham khao";
                break;
            case 3:
                tenLoaiSach = "Sach chuyen nganh";
                break;
            case 4:
                tenLoaiSach = "Sach khac";
                break;
            default:
                tenLoaiSach = "Khong xac dinh";
                break;
        }

        // --- BAI 2,3 TUAN 3 ---
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        // --- HIEN THI KET QUA ---
        System.out.println("=== THONG TIN SACH ===");
        System.out.println(" Ma sach: " + maSach);
        System.out.println(" Ten sach: " + tenSach);
        System.out.println(" Tac gia: " + tacGia);
        System.out.println(" Loai sach: " + tenLoaiSach);
        System.out.println(" Nam xuat ban: " + namXuatBan);
        System.out.println(" Don gia: " + donGia);
        System.out.println(" So luong: " + soLuong);
        System.out.println("----------------------------------------");

        // --- BAI 1 TUAN 4 ---
        System.out.print("-> Kiem tra du lieu (Bai 1): ");
        if (donGia > 0 && soLuong >= 0 && namXuatBan <= 2026 && namXuatBan > 1500)
            System.out.println("Du lieu hop le!");
        else 
            System.out.println("Du lieu khong hop le!");

        // --- BAI 2 TUAN 4 ---
        System.out.print("-> Phan loai gia (Bai 2): ");
        if (donGia < 50000) 
            System.out.println("Sach gia thap");
        else 
            if (donGia <= 100000) 
            System.out.println("Sach gia trung binh");
           else 
                if (donGia <= 200000) 
                System.out.println("Sach gia cao");
               else 
                System.out.println("Sach gia dac biet");
        

        // --- BAI 3 TUAN 4 ---
        System.out.print("-> Phan loai ton kho (Bai 3): ");
        if (soLuong == 0)
            System.out.println("Het sach"); 
        else 
            if (soLuong <= 5) 
            System.out.println("Sap het");
            else 
                if (soLuong <= 20) 
                System.out.println("Con it");
                else 
                System.out.println("Con nhieu");
        

        System.out.println("----------------------------------------");
        System.out.println("-> Thanh tien : " + thanhTien);
        System.out.println("-> Phi van chuyen 5% : " + phiVanChuyen);
        System.out.println("-> Tong tien nhap : " + tongTienNhap);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}