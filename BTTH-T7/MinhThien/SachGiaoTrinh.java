public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - namXuatBan;
        return giaCoBan + (soNamXuatBan * 5000);
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Mon hoc: " + monHoc + 
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
