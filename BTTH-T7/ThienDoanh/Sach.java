import java.util.Scanner;

public abstract class Sach {
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double giaCoBan;
    protected int soLuong;
    protected String viTriLuuTru;

    public Sach() {}

    public Sach(String tenSach, String tacGia, int namXuatBan, double giaCoBan, int soLuong, String viTriLuuTru) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTriLuuTru = viTriLuuTru;
    }

    public abstract double tinhGiaBan();

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia co ban: ");
        giaCoBan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vi tri luu tru: ");
        viTriLuuTru = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Ten sach: " + tenSach +
               ", Tac gia: " + tacGia +
               ", Nam XB: " + namXuatBan +
               ", Gia co ban: " + giaCoBan +
               ", So luong: " + soLuong +
               ", Vi tri: " + viTriLuuTru;
    }
}
