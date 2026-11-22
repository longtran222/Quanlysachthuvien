package BTT9;

import java.util.ArrayList;
import java.util.Scanner;

public class baitapt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sachgiaokhoa> dsSGK = new ArrayList<>();
        ArrayList<sachthamkhao> dsSTK = new ArrayList<>();

        System.out.print("Nhap so luong SGK: ");
        int nSGK = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nSGK; i++) {
            sachgiaokhoa sgk = new sachgiaokhoa();
            sgk.nhap(sc);
            dsSGK.add(sgk);
        }

        System.out.print("Nhap so luong STK: ");
        int nSTK = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nSTK; i++) {
            sachthamkhao stk = new sachthamkhao();
            stk.nhap(sc);
            dsSTK.add(stk);
        }

        double tongSGK = 0;
        for (sachgiaokhoa sgk : dsSGK) {
            sgk.inthongtinsach();
            tongSGK += sgk.thanhtien();
        }

        double tongSTK = 0, tongGiaSTK = 0;
        for (sachthamkhao stk : dsSTK) {
            stk.inthongtinsach();
            tongSTK += stk.thanhtien();
            tongGiaSTK += stk.getDongia();
        }

        System.out.println("Tong thanh tien SGK: " + tongSGK);
        System.out.println("Tong thanh tien STK: " + tongSTK);
        if (!dsSTK.isEmpty()) {
            System.out.println("Trung binh don gia STK: " + (tongGiaSTK / dsSTK.size()));
        }

        System.out.print("Nhap NXB can tim: ");
        String x = sc.nextLine();
        for (sachgiaokhoa sgk : dsSGK) {
            if (sgk.getNhaxuatban().equalsIgnoreCase(x)) {
                sgk.inthongtinsach();
            }
        }
        sc.close();
    }
}