public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "[Sach Giao Trinh] " + super.toString() +
                String.format(" | Mon hoc: %s | Gia ban: %.0f VND", monHoc, tinhGiaBan());
    }
}
