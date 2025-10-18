public class SachGiaoTrinh extends Sach {

    public SachGiaoTrinh(String tenSach, String tacGia, int namXuatBan, double giaCoBan) {
        super(tenSach, tacGia, namXuatBan, giaCoBan);
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        if (soNam < 0) soNam = 0;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "[Sach Giao Trinh] " + super.toString() +
               ", Gia ban: " + tinhGiaBan();
    }
}
