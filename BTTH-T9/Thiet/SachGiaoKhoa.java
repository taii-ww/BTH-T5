public class SachGiaoKhoa extends Sach {
    private String tinhTrang; // "mới" hoặc "cũ"

    public SachGiaoKhoa(String maSach, String tenSach, String nhaXuatBan, double donGia, int soLuong, String tinhTrang) {
        super(maSach, tenSach, nhaXuatBan, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhGiaBan() {
        if (tinhTrang.equalsIgnoreCase("mới"))
            return getSoLuong() * getDonGia();
        else
            return getSoLuong() * getDonGia() * 0.5; // giảm 50% nếu cũ
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Tình trạng: " + tinhTrang + " | Thành tiền: " + tinhGiaBan());
    }
}
