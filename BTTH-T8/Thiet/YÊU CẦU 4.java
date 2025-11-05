import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Tiêu đề: "); String td = sc.nextLine();
                    System.out.print("Giá cơ bản: "); double gia = sc.nextDouble();
                    System.out.print("Số lượng: "); int sl = sc.nextInt(); sc.nextLine();
                    System.out.print("Vị trí: "); String vt = sc.nextLine();
                    System.out.print("Môn học: "); String mh = sc.nextLine();

                    Sach sg = new SachGiaoTrinh(td, gia, sl, vt, mh);
                    quanLy.themSach(sg);
                }
                case 2 -> {
                    System.out.print("Tiêu đề: "); String td = sc.nextLine();
                    System.out.print("Giá cơ bản: "); double gia = sc.nextDouble();
                    System.out.print("Số lượng: "); int sl = sc.nextInt(); sc.nextLine();
                    System.out.print("Vị trí: "); String vt = sc.nextLine();
                    System.out.print("Thể loại: "); String tl = sc.nextLine();

                    Sach stt = new SachTieuThuyet(td, gia, sl, vt, tl);
                    quanLy.themSach(stt);
                }
                case 3 -> quanLy.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhập tiêu đề cần tìm: "); String td = sc.nextLine();
                    Sach kq = quanLy.timKiemSach(td);
                    if (kq != null) System.out.println(kq);
                    else System.out.println("❌ Không tìm thấy sách!");
                }
                case 5 -> {
                    System.out.print("Nhập tiêu đề cần xóa: "); String td = sc.nextLine();
                    quanLy.xoaSach(td);
                }
                case 0 -> System.out.println("👋 Thoát chương trình.");
                default -> System.out.println("❗ Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
