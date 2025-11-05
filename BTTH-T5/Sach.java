public class SACH{
    private String masach;
    private String tieude;
    private String tacgia;
    private int nam_xuat_ban;
    private int so_luong;

    public SACH(String masach, String tieude, String tacgia, int nam_xuat_ban, int so_luong)
    {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.nam_xuat_ban = nam_xuat_ban;
        this.so_luong = so_luong;
    }

    public void hien_thi_thong_tin()
    {
        System.out.println("masach: "+masach);
        System.out.println("tieude: "+tieude);
        System.out.println("author: "+tacgia);
        System.out.println("nam_xuat_ban: "+nam_xuat_ban);
        System.out.println("so_luong: "+so_luong);
    }
}