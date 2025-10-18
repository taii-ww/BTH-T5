import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSach = new ArrayList<>();

        System.out.println("nhap so luong sach");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++) {
            System.out.println("\n Nhap thong tin danh sach thu " +i);
            System.out.println("Loai sach: 1. Giao Trinh    2. Tieu Thuyet");
            int loai = sc.nextInt();
            sc.nextLine();

            System.out.println("ten sach: ");
            String ten = sc.nextLine();

            System.out.println("tac gia: ");
            String tacGia = sc.nextLine();

            System.out.println("Nam Xuat Ban: ");
            int nam = sc.nextInt();

            System.out.println("gia co ban: ");
            double gia = sc.nextDouble();
            sc.nextLine();

            if (loai == 1) {
                danhSach.add(new SachGiaoTrinh(ten, tacGia, nam, gia));
            } else {
                System.out.println("co phai la sach series (true/false): ");
                boolean laSeries = sc.nextBoolean();
                danhSach.add(new SachTieuThuyet(ten, tacGia, nam, gia, laSeries));
            }

        }
        sc.close();
        System.out.println("-----Danh Sach Sach------");
        for(Sach s: danhSach){
            System.out.println(s);
        }
    } 
}