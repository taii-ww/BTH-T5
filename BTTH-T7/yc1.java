public abstract class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double giaCoBan;

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double giaCoBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
    }

    // Getter - Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // 🧠 Phương thức trừu tượng – buộc lớp con phải cài đặt
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach + 
               ", Tên sách: " + tenSach + 
               ", Tác giả: " + tacGia + 
               ", Năm XB: " + namXuatBan + 
               ", Giá cơ bản: " + giaCoBan;
    }
}
