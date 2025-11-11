

public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lap trinh Java co ban", "Nguyen Van A", 2022, 10);
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cau truc du lieu va giai thuat");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2020);
        sach2.setSoLuong(5);
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
