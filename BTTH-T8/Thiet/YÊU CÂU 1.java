// IGiaBan.java
public interface IGiaBan {
    double tinhGiaBan();
}

// IKiemKe.java
public interface IKiemKe {
    boolean kiemTraTonKho(int soLuongToiThieu);
    void capNhatViTri(String viTriMoi);
}

// Lớp trừu tượng Sach.java
public abstract class Sach implements IGiaBan, IKiemKe {
    private String tieuDe;
    private double giaCoBan;
    private int soLuong;
    private String viTri;

    public Sach(String tieuDe, double giaCoBan, int soLuong, String viTri) {
        this.tieuDe = tieuDe;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // Getters & Setters
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    // Phương thức abstract từ IGiaBan và IKiemKe sẽ được lớp con cài đặt
    @Override
    public abstract double tinhGiaBan();

    @Override
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);

    @Override
    public abstract void capNhatViTri(String viTriMoi);

    @Override
    public String toString() {
        return "Tiêu đề: " + tieuDe +
                ", Giá cơ bản: " + giaCoBan +
                ", Số lượng: " + soLuong +
                ", Vị trí: " + viTri;
    }
}
