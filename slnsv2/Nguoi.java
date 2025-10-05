

abstract class Nguoi{
    private String hoTen;
    private String DiaChi;
    private String SDT;
    private String email;
    public Nguoi() {
        hoTen ="";
        DiaChi = "";
        SDT =  "";
        email = "";
    }
    
    
    public Nguoi (String hoten, String DiaChi, String SDT, String email){
        this.hoTen = hoten;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.email = email;
    }
 // Getters and Setters
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        this.DiaChi = diaChi;
    }

    public String getDienThoai() {
        return SDT;
    }

    public void setDienThoai(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}



