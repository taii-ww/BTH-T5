    //Tạo lớp Sach (Book) để biểu diễn thông tin về một cuốn sách.
public class Sach {
    private String maSach; //tính đóng gói 
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    //Constructor
    public Sach(){
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Getter và Setter
    public String getMaSach() {
        return maSach;
    }


    @Override
    public String toString() {
        return "Mã sách: " + maSach + 
               ", Tiêu đề: " + tieuDe + 
               ", Tác giả: " + tacGia + 
               ", Năm XB: " + namXuatBan + 
               ", Số lượng: " + soLuong;
    }
}