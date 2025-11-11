public class Test {
    public static void main(String[] args) {
       
        IQuanLySach quanLy = new QuanLySachImpl();

        Sach s1 = new SachGiaoTrinh("Java Co Ban", "Nguyen Van A", 2020, 10, 50000, "Lap trinh");
        Sach s2 = new SachGiaoTrinh("Cau Truc Du Lieu", "Tran Thi B", 2019, 5, 60000, "Tin hoc co so");
        Sach s3 = new SachTieuThuyet("Harry Potter", "J.K. Rowling", 2015, 8, 80000, "Fantasy", true);
        Sach s4 = new SachTieuThuyet("Sherlock Holmes", "Arthur Conan Doyle", 2000, 3, 70000, "Trinh tham", false);

        quanLy.themSach(s1);
        quanLy.themSach(s2);
        quanLy.themSach(s3);
        quanLy.themSach(s4);

        System.out.println("==== DANH SACH SAU KHI THEM ====");
        quanLy.hienThiDanhSach();

    
        System.out.println("\n==== KIEM TRA TIM KIEM ====");
        Sach tim = quanLy.timKiemSach("Harry Potter");
        if (tim != null)
            System.out.println("Tim thay: " + tim);
        else
            System.out.println("Khong tim thay!");

      
        System.out.println("\n==== KIEM TRA TON KHO ====");
        System.out.println(s1.getTieuDe() + " ton >= 5 ? " + s1.kiemTraTonKho(5));
        System.out.println(s4.getTieuDe() + " ton >= 10 ? " + s4.kiemTraTonKho(10));

     
        System.out.println("\n==== CAP NHAT VI TRI ====");
        s3.capNhatViTri("Ke A1");
        s1.capNhatViTri("Ke B2");

     
        System.out.println("\n==== THU XOA SACH ====");
        boolean daXoa = quanLy.xoaSach("Sherlock Holmes");
        System.out.println(daXoa ? "Da xoa thanh cong!" : "Khong tim thay đe xoa!");

        System.out.println("\n==== DANH SACH SAU KHI XOA ====");
        quanLy.hienThiDanhSach();
    }
}
