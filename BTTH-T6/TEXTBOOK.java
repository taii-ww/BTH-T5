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
    }

    public void Xuat(){
      super.Xuat();
      System.out.println("Mon hoc: "+Monhoc);
      System.out.println("Cap do: "+Capdo);
    }

  @Override
  public String toString(){
    return "Mon hoc: "+Monhoc
           +"\nCap do: "+Capdo
           +"\nma sach: "+ masach
           +"\ntieu de: "+tieude
           +"\ntac gia: "+tacgia
           +"\nnam xuat ban: "+nam_xuat_ban
           +"\nso luong: "+so_luong;
  }
}