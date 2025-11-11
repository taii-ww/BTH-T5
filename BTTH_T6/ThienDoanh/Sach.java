package BTTH_T6.ThienDoanh;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    protected int soLuong; // Đổi thành protected để lớp con và cùng package truy cập

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    // Thêm setter cho soLuong
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               ", Tiêu đề: " + tieuDe +
               ", Tác giả: " + tacGia +
               ", Năm XB: " + namXuatBan +
               ", Số lượng: " + soLuong;
    }
}