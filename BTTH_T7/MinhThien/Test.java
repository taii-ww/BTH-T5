public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sgk = new SachGiaoTrinh("GT01", "Giao trinh Java", 2020, 120, 50000, "Lap trinh Java");
        SachTieuThuyet stt = new SachTieuThuyet("TT01", "Harry Potter", 2023, 50, 70000, true);

        ql.themSach(sgk);
        ql.themSach(stt);

        ql.hienThiDanhSachSach();

    
        IKiemKe kiemKe = new SachGiaoTrinh("GT02", "Giao trinh C#", 2022, 90, 60000, "Lap trinh C#");
        System.out.println("Kiem tra ton kho >= 100: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}
