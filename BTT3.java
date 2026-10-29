import java.util.Scanner;

public class BTT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- BÀI 1: Nhập thông tin sách ---
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

        // --- BÀI 2: Tính thành tiền = đơn giá × số lượng ---
        double thanhTien = donGia * soLuong;

        // --- BÀI 3: Phí vận chuyển = 5% giá trị sách (thành tiền) ---
        double phiVanChuyen = thanhTien * 0.05;

        // --- BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển ---
        double tongTienNhap = thanhTien + phiVanChuyen;

        // --- HIỂN THỊ KẾT QUẢ ---
        System.out.println(" Ma sach: " + maSach);
        System.out.println(" Ten sach: " + tenSach);
        System.out.println(" Tac gia: " + tacGia);
        System.out.println(" Nam xuat ban: " + namXuatBan);
        System.out.println(" Don gia: " + donGia);
        System.out.println(" So luong: " + soLuong);
        System.out.println("----------------------------------------");
        System.out.println("-> Thanh tien : " + thanhTien);
        System.out.println("-> Phi van chuyen 5% : " + phiVanChuyen);
        System.out.println("-> Tong tien nhap : " + tongTienNhap);
        System.out.println("========================================");

        scanner.close();
    }
}
