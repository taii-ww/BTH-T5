public class Main {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách giáo khoa
        ql.themSach(new SachGiaoKhoa("SGK01", "Toán 12", "NXB Giáo Dục", 25000, 10, "mới"));
        ql.themSach(new SachGiaoKhoa("SGK02", "Văn 11", "NXB Giáo Dục", 20000, 5, "cũ"));

        // Thêm sách tham khảo
        ql.themSach(new SachThamKhao("STK01", "Hướng Dẫn Java", "NXB Trẻ", 75000, 3, 5000));
        ql.themSach(new SachThamKhao("STK02", "Lập Trình SQL", "NXB Khoa Học", 65000, 2, 3000));

        // Hiển thị tất cả
        System.out.println("=== DANH SÁCH SÁCH ===");
        ql.hienThiTatCa();

        // Thống kê
        ql.thongKeTongTien();

        // Tìm theo NXB
        ql.timSachTheoNXB("NXB Giáo Dục");
    }
}
