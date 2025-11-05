public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, String tenSach, String nhaXuatBan, double donGia, int soLuong, double thue) {
        super(maSach, tenSach, nhaXuatBan, donGia, soLuong);
        this.thue = thue;
    }

    @Override
    public double tinhGiaBan() {
        return getSoLuong() * getDonGia() + thue;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Thuế: " + thue + " | Thành tiền: " + tinhGiaBan());
    }
}
