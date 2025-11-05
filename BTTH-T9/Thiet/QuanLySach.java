import java.util.ArrayList;

public class QuanLySach implements IThongKe {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiTatCa() {
        for (Sach s : danhSach) {
            s.hienThi();
            System.out.println("---------------------------");
        }
    }

    @Override
    public void thongKeTongTien() {
        double tong = 0;
        for (Sach s : danhSach) {
            tong += s.tinhGiaBan();
        }
        System.out.println("=> Tổng tiền của toàn bộ sách: " + tong);
    }

    @Override
    public void timSachTheoNXB(String nxb) {
        System.out.println("Danh sách sách của NXB: " + nxb);
        for (Sach s : danhSach) {
            if (s.getNhaXuatBan().equalsIgnoreCase(nxb)) {
                s.hienThi();
            }
        }
    }
}
