


public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, double giaCoBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;
    }

    @Override
    public String toString() {
        return "Sach Giao Trinh [" +
                "Ma: " + getMaSach() +
                ", Tieu de: " + getTieuDe() +
                ", Tac gia: " + getTacGia() +
                ", Mon hoc: " + monHoc +
                ", Cap do: " + capDo +
                ", Gia ban: " + tinhGiaBan() +
                ", So luong: " + getSoLuong() +
                "]";
    }
}
