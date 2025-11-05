// SachGiaoTrinh.java
public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, double giaCoBan, int soLuong, String viTri, String monHoc) {
        super(tieuDe, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    // Getter Setter
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    // Ghi đè IGiaBan
    @Override
    public double tinhGiaBan() {
        // Sách giáo trình có VAT 10%
        return getGiaCoBan() * 1.1;
    }

    // Ghi đè IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Giáo trình] " + super.toString() + ", Môn học: " + monHoc + ", Giá bán: " + tinhGiaBan();
    }
}

// SachTieuThuyet.java
public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String tieuDe, double giaCoBan, int soLuong, String viTri, String theLoai) {
        super(tieuDe, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    @Override
    public double tinhGiaBan() {
        // Sách tiểu thuyết có lời 20%
        return getGiaCoBan() * 1.2;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Tiểu thuyết] " + super.toString() + ", Thể loại: " + theLoai + ", Giá bán: " + tinhGiaBan();
    }
}
