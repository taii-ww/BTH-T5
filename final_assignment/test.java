import java.util.Scanner;
public class test {
    public static void main (String[] args)
    {        
       Scanner sc = new Scanner(System.in);
       IQuanLySach ql = new SachManager();
        
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap Sach");
            System.out.println("2. Xoa sach theo ma");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Cap nhat danh sach");
            System.out.println("5. Hien thi danh sach sach");
            System.out.println("6. Hien thi gia ban");
            System.out.println("7. Kiem tra ton kho");
            System.out.println("8. Thong ke so luong sach");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ql.Nhap();
                    break;
                case 2:
                     System.out.print("Nhập mã sách cần xóa: ");
                     String maxoa = sc.nextLine();
                    ql.XoaSachTheoMa(maxoa);
                    break;
                case 3:
                     System.out.print("Nhap ma sach can tim: ");
                     String matim = sc.nextLine();
                    System.out.println(ql.TimKiemSach(matim));
                    break;
                case 4:
                    ql.CapNhatList();
                    break;
                case 5:
                    ql.Xuat();
                    break;
                case 6:
                    ql.Tinhgiaban();
                    break;
                case 7:
                   System.out.print("Nhap ma sach can kiem tra ton kho: ");
                   String makiem = sc.nextLine();
                   ql.kiemTraTonKho(makiem);
                   break;
                case 8:
                    ql.ThongKe();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }

        }while (choice != 0);
    }
}
