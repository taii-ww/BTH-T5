public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, int namXuatBan, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, namXuatBan, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + soNam * 5000;
    }

    @Override
    public String toString() {
        return "[Giáo trình] " + super.toString() +
               ", Môn học: " + monHoc + 
               ", Cấp độ: " + capDo + 
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
