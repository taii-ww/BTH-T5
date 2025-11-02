public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;

    public SachGiaoTrinh() {
        super();
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.1;
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
        System.out.print("Nhap mon hoc cua sach giao trinh: ");
        monHoc = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Mon hoc: " + monHoc;
    }
}
