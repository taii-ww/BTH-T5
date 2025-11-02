public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet() {
        super();
    }

    @Override
    public double tinhGiaBan() {
        double giaBan = giaCoBan;
        if (laSachSeries) {
            giaBan += 15000;
        }
        return giaBan;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTriLuuTru = viTriMoi;
        System.out.println("Da chuyen sach \"" + tenSach + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public void nhapThongTin(java.util.Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Sach co phai la series khong (true/false): ");
        laSachSeries = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", La sach series: " + laSachSeries;
    }
}
