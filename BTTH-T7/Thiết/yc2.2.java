public class SachTieuThuyet extends Sach {
    private boolean laSachSeries;
    private String theLoai;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia, int namXuatBan, double giaCoBan,
                          boolean laSachSeries, String theLoai) {
        super(maSach, tenSach, tacGia, namXuatBan, giaCoBan);
        this.laSachSeries = laSachSeries;
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "[Tiểu thuyết] " + super.toString() + 
               ", Thể loại: " + theLoai + 
               ", Series: " + (laSachSeries ? "Có" : "Không") + 
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
