import java.util.Scanner;

public class BTT56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        int tongSoLuong = 0;
        double tongGiaTri = 0;
        int n = 0; 

        // Khai bao cac bien luu tru rieng cho tung cuon (ho tro toi da 5 cuon)
        String ma1 = "", ten1 = "", ma2 = "", ten2 = "", ma3 = "", ten3 = "", ma4 = "", ten4 = "", ma5 = "", ten5 = "";
        int sl1 = 0, sl2 = 0, sl3 = 0, sl4 = 0, sl5 = 0;
        double gia1 = 0, gia2 = 0, gia3 = 0, gia4 = 0, gia5 = 0;

        do {
            System.out.println("\n=================== QUAN LY THU VIEN SMARTLIB ===================");
            System.out.println("1. Bai 1: Nhap danh sach n sach");
            System.out.println("2. Bai 2: Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Bai 3: Tim sach theo ma");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================================================");
            System.out.print("Moi ban chon chuc nang (0-3): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.print("\nNhap so luong sach (n, toi da 5 cuon): ");
                    n = Integer.parseInt(scanner.nextLine());
                    
                    // Gioi han toi da 5 cuon de tranh vuot qua bien da khai bao
                    if (n > 5) {
                        n = 5;
                        System.out.println("Chuong trinh gioi han luu toi da 5 cuon. Da tu dong dat n = 5.");
                    }

                    tongSoLuong = 0;
                    tongGiaTri = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.println("\n--- Nhap thong tin cuon sach thu " + i + " ---");
                        System.out.print("Nhap ma sach: ");
                        String ma = scanner.nextLine();
                        System.out.print("Nhap ten sach: ");
                        String ten = scanner.nextLine();
                        System.out.print("Nhap so luong: ");
                        int sl = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhap gia tien: ");
                        double gia = Double.parseDouble(scanner.nextLine());

                        tongSoLuong += sl;
                        tongGiaTri += (sl * gia);

                        // Luu vao cac bien tuong ung tu cuon 1 den cuon 5
                        if (i == 1) { ma1 = ma; ten1 = ten; sl1 = sl; gia1 = gia; }
                        else if (i == 2) { ma2 = ma; ten2 = ten; sl2 = sl; gia2 = gia; }
                        else if (i == 3) { ma3 = ma; ten3 = ten; sl3 = sl; gia3 = gia; }
                        else if (i == 4) { ma4 = ma; ten4 = ten; sl4 = sl; gia4 = gia; }
                        else if (i == 5) { ma5 = ma; ten5 = ten; sl5 = sl; gia5 = gia; }
                    }
                    System.out.println("\n=> Da nhap thanh cong " + n + " cuon sach!");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("\n[Loi] Chua co du lieu! Vui long chon Bai 1 de nhap sach truoc.");
                    } else {
                        System.out.println("\n---------------- KET QUA THONG KE KHO ----------------");
                        System.out.println("Tong so luong sach trong kho: " + tongSoLuong);
                        System.out.printf("Tong gia tri sach trong kho  : %.2f\n", tongGiaTri);
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("\n[Loi] Danh sach sach trong! Vui long chon Bai 1 de nhap sach truoc.");
                    } else {
                        System.out.print("\nNhap ma sach can tim: ");
                        String maTim = scanner.nextLine();
                        boolean timThay = false;

                        // Kiem tra lan luot tu cuon 1 den cuon 5
                        if (n >= 1 && ma1.equalsIgnoreCase(maTim)) {
                            System.out.println("\n--- TIM THAY SACH ---");
                            System.out.printf("Ma: %s | Ten: %s | So luong: %d | Gia: %.2f\n", ma1, ten1, sl1, gia1);
                            timThay = true;
                        }
                        if (n >= 2 && ma2.equalsIgnoreCase(maTim)) {
                            System.out.println("\n--- TIM THAY SACH ---");
                            System.out.printf("Ma: %s | Ten: %s | So luong: %d | Gia: %.2f\n", ma2, ten2, sl2, gia2);
                            timThay = true;
                        }
                        if (n >= 3 && ma3.equalsIgnoreCase(maTim)) {
                            System.out.println("\n--- TIM THAY SACH ---");
                            System.out.printf("Ma: %s | Ten: %s | So luong: %d | Gia: %.2f\n", ma3, ten3, sl3, gia3);
                            timThay = true;
                        }
                        if (n >= 4 && ma4.equalsIgnoreCase(maTim)) {
                            System.out.println("\n--- TIM THAY SACH ---");
                            System.out.printf("Ma: %s | Ten: %s | So luong: %d | Gia: %.2f\n", ma4, ten4, sl4, gia4);
                            timThay = true;
                        }
                        if (n >= 5 && ma5.equalsIgnoreCase(maTim)) {
                            System.out.println("\n--- TIM THAY SACH ---");
                            System.out.printf("Ma: %s | Ten: %s | So luong: %d | Gia: %.2f\n", ma5, ten5, sl5, gia5);
                            timThay = true;
                        }

                        if (!timThay) {
                            System.out.println("Khong tim thay cuon sach nao co ma: \"" + maTim + "\"");
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nDa thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("\nLua chon khong hop le! Vui long chon so tu 0 den 3.");
            }
        } while (choice != 0);

        scanner.close();
    }
}