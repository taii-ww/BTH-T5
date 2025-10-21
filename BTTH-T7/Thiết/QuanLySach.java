import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> dsSach;

    public QuanLySach() {
        dsSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        dsSach.add(s);
    }

    public void hienThiDanhSach() {
        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Sach s : dsSach) {
            System.out.println(s.toString());
        }
    }
}
