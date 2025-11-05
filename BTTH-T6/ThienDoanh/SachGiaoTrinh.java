public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
<<<<<<<< HEAD:BTTH-T6/lop con1.java
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo;
========
               ", Môn học: " + monHoc +
               ", Cấp độ: " + capDo;
>>>>>>>> 683972fd28fca78e6732c011da8bb05ceac246c9:BTTH-T6/ThienDoanh/SachGiaoTrinh.java
    }
}
