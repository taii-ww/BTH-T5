public abstract class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private double donGia;
    private int soLuong;

    public Sach(String maSach, String tenSach, String nhaXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // getter & setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }
    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }
    public String getNhaXuatBan() { return nhaXuatBan; }
    public void setNhaXuatBan(String nhaXuatBan) { this.nhaXuatBan = nhaXuatBan; }
    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    // phương thức trừu tượng
    public abstract double tinhGiaBan();

    public void hienThi() {
        System.out.printf("Mã: %s | Tên: %s | NXB: %s | Giá: %.2f | SL: %d%n",
                maSach, tenSach, nhaXuatBan, donGia, soLuong);
    }
}
