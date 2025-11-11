public abstract class Sach {
    protected String maSach;
    protected String tieuDe;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter và Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // 👉 Phương thức trừu tượng (bắt buộc lớp con phải ghi đè)
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Ma sach: " + maSach + 
               ", Tieu de: " + tieuDe + 
               ", Nam XB: " + namXuatBan +
               ", So luong: " + soLuong + 
               ", Gia co ban: " + giaCoBan;
    }
}
