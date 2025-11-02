import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap sach giao trinh");
            System.out.println("2. Nhap sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Kiem tra giao dien IKiemKe");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(sc.nextLine());

            if (chon == 0) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            }

            switch (chon) {
                case 1:
                    SachGiaoTrinh sgk = new SachGiaoTrinh();
                    sgk.nhapThongTin(sc);
                    ql.themSach(sgk);
                    break;
                case 2:
                    SachTieuThuyet stt = new SachTieuThuyet();
                    stt.nhapThongTin(sc);
                    ql.themSach(stt);
                    break;
                case 3:
                    ql.hienThiDanhSachSach();
                    break;
                case 4:
                    System.out.println("\n--- Kiem tra giao dien IKiemKe ---");
                    IKiemKe kiemKe = new SachGiaoTrinh();
                    ((SachGiaoTrinh) kiemKe).nhapThongTin(sc);

                    System.out.print("Nhap so luong toi thieu can kiem tra: ");
                    int soLuongToiThieu = Integer.parseInt(sc.nextLine());
                    System.out.println("Con du hang? " + kiemKe.kiemTraTonKho(soLuongToiThieu));

                    System.out.print("Nhap vi tri moi de cap nhat: ");
                    String viTriMoi = sc.nextLine();
                    kiemKe.capNhatViTri(viTriMoi);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

        sc.close();
    }
}
