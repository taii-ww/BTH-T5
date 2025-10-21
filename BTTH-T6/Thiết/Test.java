public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách giáo trình
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A", 2022, 10, "Công nghệ thông tin", "Đại học");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Toán cao cấp", "Trần Văn B", 2021, 5, "Toán học", "Đại học");

        // Thêm sách tiểu thuyết
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2007, 15, "Phiêu lưu", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Người tình Sputnik", "Haruki Murakami", 2015, 8, "Tình cảm", false);

        // Thêm vào danh sách
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        // Hiển thị danh sách
        System.out.println("=== DANH SÁCH SÁCH ===");
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println("\n=== TÌM KIẾM SÁCH MÃ 'TT01' ===");
        Sach tim = ql.timKiemTheoMa("TT01");
        System.out.println(tim != null ? tim : "Không tìm thấy!");

        // Cập nhật
        System.out.println("\n=== CẬP NHẬT SÁCH 'GT02' ===");
        ql.capNhatSach("GT02", new SachGiaoTrinh("GT02", "Toán rời rạc", "Trần Văn B", 2023, 7, "Toán học", "Đại học"));
        ql.hienThiDanhSach();

        // Xóa sách
        System.out.println("\n=== XÓA SÁCH 'TT02' ===");
        ql.xoaSach("TT02");
        ql.hienThiDanhSach();
    }
}
