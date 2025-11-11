


import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach sach = timKiemSach(maSach);
        if (sach != null) {
            danhSach.remove(sach);
            System.out.println("Da xoa sach: " + sach.getTieuDe());
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("Danh sach sach:");
            for (Sach s : danhSach) System.out.println(s);
        }
    }
}
