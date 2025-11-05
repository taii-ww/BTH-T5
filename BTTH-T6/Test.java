public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        
        Sach s1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2023, 10, "CNTT", "Dai hoc");
        Sach s2 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 1990, 50, "Thieu nhi", true);
        Sach s3 = new SachTieuThuyet("TT02", "Trai hoa vang", "Nguyen Nhat Anh", 2010, 20, "Tinh cam", false);

        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);

        System.out.println("Danh sach ban dau:");
        ql.hienThiDanhSach();

        System.out.println("\nTim sach co ma TT01:");
        System.out.println(ql.timKiemTheoMa("TT01"));

        System.out.println("\nCap nhat sach GT01:");
        ql.capNhatSach("GT01", new SachGiaoTrinh("GT01", "Co so du lieu", "Nguyen Van A", 2022, 5, "CNTT", "Dai hoc"));
        ql.hienThiDanhSach();

        System.out.println("\nXoa sach TT02:");
        ql.xoaSach("TT02");
        ql.hienThiDanhSach();
    }
}
