public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach() {
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan > 0) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ!");
        }
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng không thể âm!");
        }
    }
    public void hienThiThongTin() {
        System.out.println("----- Thông tin sách -----");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2023, 10);
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cơ sở dữ liệu");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
