import java.util.ArrayList;
import java.util.Scanner;

public class BTT56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Khai bao cac ArrayList de luu tru thong tin rieng biet cho tung cuon sach
        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<String> dsTenSach = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();
        ArrayList<Double> dsGiaTien = new ArrayList<>();
        
        int choice;

        do {
            System.out.println("\n=================== QUAN LY THU VIEN ===================");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Sua thong tin sach theo ma");
            System.out.println("6. Tinh tong so luong sach trong kho");
            System.out.println("7. Tinh tong gia tri sach trong kho");
            System.out.println("8. Thoat chuong trinh");
            System.out.println("=================================================================");
            System.out.print("Moi ban chon chuc nang (1-8): ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("\n--- THEM SACH MOI ---");
                    System.out.print("Nhap ma sach: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhap ten sach: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhap gia tien: ");
                    double gia = Double.parseDouble(scanner.nextLine());

                    // Them du lieu vao cac ArrayList tuong ung
                    dsMaSach.add(ma);
                    dsTenSach.add(ten);
                    dsSoLuong.add(sl);
                    dsGiaTien.add(gia);
                    
                    System.out.println("=> Them sach thanh cong!");
                    break;

                case 2:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("\n[Thong bao] Thu vien hien chua co cuon sach nao!");
                    } else {
                        System.out.println("\n---------------- DANH SACH SACH TRONG THU VIEN ----------------");
                        for (int i = 0; i < dsMaSach.size(); i++) {
                            System.out.printf("%d. Ma: %-10s | Ten: %-20s | So luong: %-5d | Gia: %.2f\n", 
                                (i + 1), dsMaSach.get(i), dsTenSach.get(i), dsSoLuong.get(i), dsGiaTien.get(i));
                        }
                    }
                    break;

                case 3:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("\n[Loi] Thu vien trong!");
                    } else {
                        System.out.print("\nNhap ma sach can tim: ");
                        String maTim = scanner.nextLine();
                        boolean timThay = false;

                        System.out.println("\n--- KET QUA TIM KIEM ---");
                        for (int i = 0; i < dsMaSach.size(); i++) {
                            if (dsMaSach.get(i).equalsIgnoreCase(maTim)) {
                                System.out.printf("Ma: %-10s | Ten: %-20s | So luong: %-5d | Gia: %.2f\n", 
                                    dsMaSach.get(i), dsTenSach.get(i), dsSoLuong.get(i), dsGiaTien.get(i));
                                timThay = true;
                            }
                        }
                        if (!timThay) {
                            System.out.println("Khong tim thay cuon sach nao co ma: \"" + maTim + "\"");
                        }
                    }
                    break;

                case 4:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("\n[Loi] Thu vien trong, khong the xoa!");
                    } else {
                        System.out.print("\nNhap ma sach can xoa: ");
                        String maXoa = scanner.nextLine();
                        boolean daXoa = false;

                        for (int i = 0; i < dsMaSach.size(); i++) {
                            if (dsMaSach.get(i).equalsIgnoreCase(maXoa)) {
                                dsMaSach.remove(i);
                                dsTenSach.remove(i);
                                dsSoLuong.remove(i);
                                dsGiaTien.remove(i);
                                
                                daXoa = true;
                                System.out.println("=> Da xoa thanh cong sach co ma: " + maXoa);
                                break;
                            }
                        }
                        if (!daXoa) {
                            System.out.println("Khong tìm thay ma sach de xoa!");
                        }
                    }
                    break;

                case 5:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("\n[Loi] Thu vien trong, khong the sua!");
                    } else {
                        System.out.print("\nNhap ma sach can sua: ");
                        String maSua = scanner.nextLine();
                        boolean daSua = false;

                        for (int i = 0; i < dsMaSach.size(); i++) {
                            if (dsMaSach.get(i).equalsIgnoreCase(maSua)) {
                                System.out.println("Tim thay sach! Nhap thong tin moi:");
                                System.out.print("Nhap ten sach moi: ");
                                dsTenSach.set(i, scanner.nextLine());
                                System.out.print("Nhap so luong moi: ");
                                dsSoLuong.set(i, Integer.parseInt(scanner.nextLine()));
                                System.out.print("Nhap gia tien moi: ");
                                dsGiaTien.set(i, Double.parseDouble(scanner.nextLine()));

                                daSua = true;
                                System.out.println("=> Cap nhat thong tin sach thanh cong!");
                                break;
                            }
                        }
                        if (!daSua) {
                            System.out.println("Khong tim thay ma sach can sua!");
                        }
                    }
                    break;

                case 6:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("\n[Loi] Thu vien trong!");
                    } else {
                        int tongSoLuong = 0;
                        for (int slTemp : dsSoLuong) {
                            tongSoLuong += slTemp;
                        }
                        System.out.println("\n--- THONG KE SO LUONG ---");
                        System.out.println("Tong so luong sach trong kho: " + tongSoLuong);
                    }
                    break;

                case 7:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("\n[Loi] Thu vien trong!");
                    } else {
                        double tongGiaTri = 0;
                        for (int i = 0; i < dsMaSach.size(); i++) {
                            tongGiaTri += (dsSoLuong.get(i) * dsGiaTien.get(i));
                        }
                        System.out.println("\n--- THONG KE GIA TRI ---");
                        System.out.printf("Tong gia tri sach trong kho: %.2f\n", tongGiaTri);
                    }
                    break;

                case 8:
                    System.out.println("\nDa thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("\nLua chon khong hop le! Vui long chon so tu 1 den 8.");
            }
        } while (choice != 8);

        scanner.close();
    }
}