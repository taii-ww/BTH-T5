public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + 
              ", la sach series: " + laSachSeries + 
               ", Gia ban: " + tinhGiaBan() + " VND";
    }


    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + tieuDe + "\" den khu vuc: " + viTriMoi);
    }
}
