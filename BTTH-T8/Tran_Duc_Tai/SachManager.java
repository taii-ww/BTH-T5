import java.util.Scanner;
import java.util.HashMap;

public class SachManager implements IQuanLySach {
    
    private HashMap<String, SACH> List;
    Scanner sc = new Scanner(System.in);

    public SachManager(){
        List = new HashMap<>();
    }

    public void Nhap(){
        SACH s = null;
        while(true){
            System.out.println("N(novel) T(textbook) X(thoat): ");
            char type = sc.nextLine().toUpperCase().charAt(0);
            switch(type){
                case'N':
                  s = new Novel();
                  break;
                case 'T':
                  s = new TEXTBOOK();
                  break;
            }
            if(type == 'X')
              break;
            s.Nhap();
            List.put(s.masach, s);
        }       
    }

    public void Xuat(){
          for(SACH s : List.values()){
            System.out.println(s);
          }
    }

    public void Tinhgiaban(){
        for(SACH s : List.values()){
            System.out.println("gia ban cua sach co ma "+s.masach+" la: "+s.Tinhgiaban());
        }
    }

    public SACH TimKiemSach(String masach){
        return List.get(masach);
    }

    public SACH XoaSachTheoMa(String masach){
        return List.remove(masach);
    }

    public void CapNhatList(){
        System.out.println("Nhap ma sach can cap nhat: ");
        String masach = sc.nextLine();
        boolean found = false;
        for(SACH s : List.values()){
            if(s.masach.equalsIgnoreCase(masach)){
                found = true;
                System.out.println("Da tim thay ma can cap nhat");
                if(List.get(masach) instanceof Novel)
                   s = new Novel();
                if(List.get(masach) instanceof TEXTBOOK)
                   s = new TEXTBOOK();
                this.XoaSachTheoMa(masach);
                s.Nhap();
                List.put(s.masach, s);
            }         
        }
        if(!found)
          System.out.println("Khong tim thay ma can cap nhat");
    }

    public void kiemTraTonKho(String makiem){
        boolean found = false;
        System.out.println("Nhap so luong toi thieu cua ma sach: ");
        int soluongtoithieu = sc.nextInt();
        for(SACH s : List.values()){
            if(s.masach.equalsIgnoreCase(makiem)){
                found = true;
                if(s.kiemTraTonKho(soluongtoithieu))
                   System.out.println("Sach co tieu de: "+s.tieude+" con du hang trong kho");
                else 
                   System.out.println("Sach co tieu de: "+s.tieude+" KHONG con du hang trong kho");
            }
        }
        if(!found)
          System.out.println("Ko tim thay ma sach can kiem");
    }


}

