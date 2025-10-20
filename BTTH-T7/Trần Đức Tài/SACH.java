import java.util.Scanner;

public abstract class SACH{
    protected String masach;
    protected String tieude;
    protected String tacgia;
    protected int nam_xuat_ban;
    protected int so_luong;
    protected Scanner sc;
    protected double giaCoBan;

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
        Scanner sc = new Scanner(System.in);
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
    }

    @Override
    public String toString(){
        return "ma sach: "+ masach
           +"\ntieu de: "+tieude
           +"\ntac gia: "+tacgia
           +"\nnam xuat ban: "+nam_xuat_ban
           +"\nso luong: "+so_luong;
  }
      public abstract double Tinhgiaban();
}