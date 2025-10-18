public class SachTieuThuyet extends Sach {
    private boolean laSachSeries;

    public SachTieuThuyet(String tenSach, String tacGia, int namXuatBan, double giaCoBan, boolean laSachSeries) {
        super(tenSach, tacGia, namXuatBan, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "[Sach Tieu Thuyet] " + super.toString() +
               ", La series: " + laSachSeries +
               ", Gia ban: " + tinhGiaBan();
    }
}
