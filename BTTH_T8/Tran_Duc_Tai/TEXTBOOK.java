public class TEXTBOOK extends SACH {

  private String Monhoc;
  private String Capdo;

  public TEXTBOOK (String Monhoc, String Capdo, String masach, String tieude, String tacgia, int nam_xuat_ban, int so_luong)
    {
        super(masach, tieude, tacgia, nam_xuat_ban, so_luong);
        this.Monhoc = Monhoc;
        this.Capdo = Capdo;
        
    }

    public TEXTBOOK(){
      super();
    }

    public void Nhap(){
      super.Nhap();
      System.out.println("Nhap mon hoc: ");
      Monhoc = sc.nextLine();
      System.out.println("Nhap cap do: ");
      Capdo = sc.nextLine();
      System.out.println("gia co ban: ");
      giaCoBan = sc.nextDouble();
    }

  @Override
  public String toString(){
    return super.toString()
           +"\nMon hoc: "+Monhoc
           +"\nCap do: "+Capdo;
           
  }

  @Override
  public double Tinhgiaban(){
    return giaCoBan + ((2025-nam_xuat_ban)*5000);
  } 

}