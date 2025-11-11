

public class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() { return maSach; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public int getSoLuong() { return soLuong; }

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               ", Tiêu đề: " + tieuDe +
               ", Tác giả: " + tacGia +
               ", Năm XB: " + namXuatBan +
               ", Số lượng: " + soLuong;
    }
}