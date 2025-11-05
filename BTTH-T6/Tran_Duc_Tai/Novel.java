public class Novel extends SACH {
    
  private String Theloai;
  private boolean lasachseries;


  public Novel (String Theloai, boolean lasachseries, String masach, String tieude, String tacgia, int nam_xuat_ban, int so_luong)
  {
    super(masach, tieude, tacgia, nam_xuat_ban, so_luong);
    this.Theloai = Theloai;
    this.lasachseries = lasachseries;
  }

  public Novel(){
    super();
  }


  public void Nhap(){
      super.Nhap();
      //Scanner sc = new Scanner(System.in);
      System.out.println("the loai cua sach: ");
      Theloai = sc.nextLine();
      boolean validInput = false;
        do {
            System.out.print("Co phai la sach series? (true/false hoặc yes/no): ");
            String input = sc.nextLine().toLowerCase();
            
            if (input.equals("true") || input.equals("yes") || input.equals("y") || input.equals("1")) {
                lasachseries = true;
                validInput = true;
            } else if (input.equals("false") || input.equals("no") || input.equals("n") || input.equals("0")) {
                lasachseries = false;
                validInput = true;
            } else {
                System.out.println("Vui long nhap dung: true/false, yes/no, 1/0");
            }
        } while (!validInput);

  }

  public void Xuat(){
      super.Xuat();
      System.out.println("The loai: "+Theloai);
      System.out.println("co thuoc series ko: "+lasachseries);
    }


  @Override
   public String toString(){
    return "The loai: tieu thuyet"
           +"\n Co thuoc the loai series ko: "+lasachseries
           +"\nma sach: "+ masach
           +"\ntieu de: "+tieude
           +"\ntac gia: "+tacgia
           +"\nnam xuat ban: "+nam_xuat_ban
           +"\nso luong: "+so_luong;
  }
}
