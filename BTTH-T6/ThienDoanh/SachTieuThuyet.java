public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() +
<<<<<<<< HEAD:BTTH-T6/SachTieuThuyet.java
                ", Thể loại: " + theLoai +
                ", Là series: " + (laSachSeries ? "Có" : "Không");
========
               ", Thể loại: " + theLoai +
               ", Là sách series: " + (laSachSeries ? "Có" : "Không");
>>>>>>>> 683972fd28fca78e6732c011da8bb05ceac246c9:BTTH-T6/ThienDoanh/SachTieuThuyet.java
    }
}
