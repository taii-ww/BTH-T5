public class Main {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo sách giáo trình
        Sach gt1 = new SachGiaoTrinh("GT01", "Lập Trình Java", "Nguyễn Văn A", 2020, 50000, "CNTT", "Đại học");
        Sach gt2 = new SachGiaoTrinh("GT02", "Toán Cao Cấp", "Lê Thị B", 2018, 45000, "Toán", "Cao đẳng");

        // Tạo sách tiểu thuyết
        Sach tt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2005, 70000, true, "Phiêu lưu");
        Sach tt2 = new SachTieuThuyet("TT02", "Đắc Nhân Tâm", "Dale Carnegie", 2010, 60000, false, "Kỹ năng sống");

        ql.themSach(gt1);
        ql.themSach(gt2);
        ql.themSach(tt1);
        ql.themSach(tt2);

        ql.hienThiDanhSach();
    }
}
