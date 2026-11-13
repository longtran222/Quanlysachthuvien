package BTT78;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        ArrayList<sach> danhsach = new ArrayList<>();

        sach.nhapDanhSach(danhsach, nhap);
        sach.hienThiDanhSach(danhsach);

        nhap.close();
    }
}