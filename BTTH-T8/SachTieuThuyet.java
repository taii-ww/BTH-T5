public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSeries) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "[Sach Tieu Thuyet] " + super.toString() +
                String.format(" | The loai: %s | Series: %s | Gia ban: %.0f VND",
                        theLoai, laSeries ? "Co" : "Khong", tinhGiaBan());
    }
}
