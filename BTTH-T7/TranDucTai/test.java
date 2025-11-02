import java.util.Scanner;
public class test {
    public static void main (String[] args)
    {        
       Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong phan tu danh sach ban dau: ");
        n = sc.nextInt();
        SachManager list = new SachManager(n);
        list.Nhap();
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them moi sach");
            System.out.println("2. Xoa sach theo ma");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Cap nhat danh sach");
            System.out.println("5. Hien thi danh sach sach");
            System.out.println("6. Hien thi gia ban");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addList();
                    break;
                case 2:
                    list.XoaSachTheoMa();
                    break;
                case 3:
                    list.TimKiemSach();
                    break;
                case 4:
                    list.CapNhatList();
                    break;
                case 5:
                    list.Xuat();
                    break;
                case 6:
                    list.Tinhgiaban();
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
