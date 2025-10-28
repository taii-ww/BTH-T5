// QuanLySachImpl.java
import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) {
        Sach s = timKiemSach(tieuDe);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("🗑️ Đã xóa sách: " + tieuDe);
            return true;
        }
        System.out.println("❌ Không tìm thấy sách: " + tieuDe);
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n📚 DANH SÁCH SÁCH:");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
