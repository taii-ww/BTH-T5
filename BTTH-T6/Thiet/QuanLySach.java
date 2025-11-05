import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    // Thêm sách
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    // Xóa sách theo mã
    public boolean xoaSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }

<<<<<<<< HEAD:BTTH-T6/QuanLySach.java
    // Cập nhật thông tin sách
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
========
    // Cập nhật (giả sử chỉ cập nhật số lượng)
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.soLuong = soLuongMoi;
>>>>>>>> 683972fd28fca78e6732c011da8bb05ceac246c9:BTTH-T6/ThienDoanh/QuanLySach.java
                return true;
            }
        }
        return false;
    }

<<<<<<<< HEAD:BTTH-T6/QuanLySach.java
    // Tìm kiếm sách theo mã
========
    // Tìm kiếm
>>>>>>>> 683972fd28fca78e6732c011da8bb05ceac246c9:BTTH-T6/ThienDoanh/QuanLySach.java
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

<<<<<<<< HEAD:BTTH-T6/QuanLySach.java
    // Hiển thị toàn bộ danh sách
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
========
    // Hiển thị toàn bộ sách
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
>>>>>>>> 683972fd28fca78e6732c011da8bb05ceac246c9:BTTH-T6/ThienDoanh/QuanLySach.java
        } else {
            for (Sach s : danhSach) {
                System.out.println(s.toString());
            }
        }
    }
}
