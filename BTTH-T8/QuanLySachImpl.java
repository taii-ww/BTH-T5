import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe))
                return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) {
        Sach s = timKiemSach(tieuDe);
        if (s != null) {
            danhSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}
