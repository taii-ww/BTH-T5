import java.util.Scanner;

public class SachManager {
    private SACH[] list;
    private int n;
    Scanner sc = new Scanner(System.in);

    public SachManager(int n){
        this.n = n;
        list = new SACH[n];
    }

    public void Nhap(){
        char type;
        //Scanner sc = new Scanner(System.in);
        SACH sach = null;
        for(int i=0;i<n;i++){
            System.out.println("Nhap ky tu: 'N'(Novel) 'T'(Textbook)");
            type = sc.nextLine().toUpperCase().charAt(0);
            switch(type){
                case 'N':
                  sach = new Novel();
                  break;
                case 'T':
                  sach = new TEXTBOOK();
                  break;
                default:
                  System.out.println("Nhap sai");
                  break;
            }
            if(sach != null){
                sach.Nhap();
                list[i] = sach;
            }
        }
    }

    public void Xuat(){
        for(SACH sach : list){
            sach.Xuat();
        }
    }

    public void TimKiemSach(){
        System.out.println("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        int found = 0;
        for(SACH sach : list){
            if(sach.masach.equalsIgnoreCase(ma))
              {
                sach.Xuat();
                found = 1;
              }           
        }
       if(found != 1){
        System.out.println("Ko tim thay ma sach trong LIST ");
       }
    }
    
    public void addList(){
        System.out.println("Nhap so luong muon them: ");
        int m = sc.nextInt();
        sc.nextLine();
        SACH[] newList = new SACH[n+m];
        for(int i = 0; i<n; i++){
            newList[i] = list[i];
        }
        SACH sach = null;
        for(int i=n;i<m+n;i++){           
            System.out.println("Nhap ky tu: 'N'(Novel) 'T'(Textbook)");
            char type = sc.nextLine().toUpperCase().charAt(0);
            switch(type){
                case 'N':
                  sach = new Novel();
                  break;
                case 'T':
                  sach = new TEXTBOOK();
                  break;
                default:
                  System.out.println("Nhap sai");
                  break;
            }
            if(sach != null){
                sach.Nhap();
                newList[i] = sach;
            }
        }
        list = newList;
        n = n+m;
        
    }

    public void XoaSachTheoMa() {
    System.out.print("Nhap ma sach muon xoa: ");
    String ma = sc.nextLine();

    int index = -1; 

    
    for (int i = 0; i < n; i++) {
        if (list[i] != null && list[i].masach.equalsIgnoreCase(ma)) {
            index = i;
            break;
        }
    }

    
    if (index == -1) {
        System.out.println("Khong tim thay ma sach nay trong danh sach!");
        return;
    }

    
    for (int i = index; i < n - 1; i++) {
        list[i] = list[i + 1];
    }

    list[n - 1] = null; 
    n--; 

    System.out.println("Da xoa sach co ma: " + ma);
}
}

