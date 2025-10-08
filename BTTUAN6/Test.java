public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo một số đối tượng sách
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van A", 2020, 50, "Toan", "Đai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko Fujio", 2018, 100, "Truyen tranh", true);

        // Thêm sách
        ql.themSach(sg1);
        ql.themSach(st1);

        // Hiển thị danh sách
        System.out.println("== Danh sach sach ==");
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println("\n== Tim kiem ma TT01 ==");
        Sach timThay = ql.timKiemTheoMa("TT01");
        if (timThay != null)
            System.out.println(timThay);
        else
            System.out.println("Khong tim thay sach!");

        // Cập nhật số lượng
        ql.capNhatSoLuong("GT01", 70);

        // Hiển thị lại
        System.out.println("\n== Sau khi cap nhat ==");
        ql.hienThiDanhSach();

        // Xóa sách
        ql.xoaSach("TT01");

        System.out.println("\n== Sau khi xoa ==");
        ql.hienThiDanhSach();
    }
}
