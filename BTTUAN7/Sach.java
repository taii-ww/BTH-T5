public abstract class Sach {
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double giaCoBan;

    public Sach(String tenSach, String tacGia, int namXuatBan, double giaCoBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    // Phuong thuc truu tuong
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Ten sach: " + tenSach + ", Tac gia: " + tacGia +
                ", Nam XB: " + namXuatBan + ", Gia co ban: " + giaCoBan;
    }
}
