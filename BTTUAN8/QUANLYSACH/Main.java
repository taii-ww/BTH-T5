import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        int choice;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Ma sach: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String td = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Gia co ban: "); double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("So luong: "); int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    System.out.print("Cap do: "); String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma, td, tg, gia, sl, mh, cd));
                }
                case 2 -> {
                    System.out.print("Ma sach: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String td = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Gia co ban: "); double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("So luong: "); int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("Co phai series khong (true/false): "); boolean sr = Boolean.parseBoolean(sc.nextLine());
                    quanLy.themSach(new SachTieuThuyet(ma, td, tg, gia, sl, tl, sr));
                }
                case 3 -> quanLy.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    System.out.println(s != null ? s : "Khong tim thay!");
                }
                case 5 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    if (!quanLy.xoaSach(ma)) System.out.println("Khong tim thay!");
                }
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
