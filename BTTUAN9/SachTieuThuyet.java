public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, double giaCoBan, int soLuong, String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    @Override
    public double tinhGiaBan() {
        double gia = getGiaCoBan() * 1.05;
        if (laSeries) gia *= 0.9;
        return gia;
    }

    @Override
    public String toString() {
        return "Sach Tieu Thuyet [" +
                "Ma: " + getMaSach() +
                ", Tieu de: " + getTieuDe() +
                ", Tac gia: " + getTacGia() +
                ", The loai: " + theLoai +
                ", La series: " + (laSeries ? "Co" : "Khong") +
                ", Gia ban: " + tinhGiaBan() +
                ", So luong: " + getSoLuong() +
                "]";
    }
}
