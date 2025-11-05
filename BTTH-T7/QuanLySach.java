import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    public void hienThiDanhSachSach() {
        System.out.println("===== DANH SACH SACH =====");
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
            System.out.println("Gia Ban uoc Tinh: " + s.tinhGiaBan() + " VND");
            System.out.println("------------------------------");
        }
    }
}
