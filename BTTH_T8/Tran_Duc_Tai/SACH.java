import java.util.Scanner;

public abstract class SACH implements IGiaBan, IKiemKe{
    protected String masach;
    protected String tieude;
    protected String tacgia;
    protected int nam_xuat_ban;
    protected int so_luong;
    protected Scanner sc;
    protected double giaCoBan;
    protected int vitri;

    public SACH(){
        sc = new Scanner(System.in);
    }

    public SACH(String masach, String tieude, String tacgia, int nam_xuat_ban, int so_luong)
    {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.nam_xuat_ban = nam_xuat_ban;
        this.so_luong = so_luong;
    } 

    public void Nhap(){
        System.out.println("Nhap ma sach: ");
        masach = sc.nextLine();
        System.out.println("Nhap tieu de: ");
        tieude = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        tacgia = sc.nextLine();
        System.out.println("nam xuat ban: ");
        nam_xuat_ban = sc.nextInt();
        System.out.println("So luong: ");
        so_luong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vi tri sach: ");
        vitri = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString(){
        return "ma sach: "+ masach
           +"\ntieu de: "+tieude
           +"\ntac gia: "+tacgia
           +"\nnam xuat ban: "+nam_xuat_ban
           +"\nso luong: "+so_luong
           +"\nvi tri sach: "+vitri;
  }
      public abstract double Tinhgiaban();

      @Override
      public boolean kiemTraTonKho(int soluongtoithieu){
        return so_luong >= soluongtoithieu;
      }

    @Override
    public void capNhatMa(int vitriMoi) {
    System.out.println("Đa chuyen sach co [" + tieude + "] den vi tri moi: " + vitriMoi);
    this.vitri = vitriMoi;
     }
}