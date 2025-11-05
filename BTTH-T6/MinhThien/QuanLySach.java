import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    
    public void themSach(Sach s) {
        danhSach.add(s);
    }

   
    public void xoaSach(String maSach) {
        danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

   
    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                return;
            }
        }
    }

    
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    
    public void hienThiDanhSach() {
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}
