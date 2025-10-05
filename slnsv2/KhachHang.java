
package slnsv2;

public class KhachHang extends Nguoi {
    private String MAKH;
    private int TONGNO;

    public KhachHang (){
        super();
    }
    public KhachHang (String MAKH, String hoten, String DiaChi, String SDT, String email, int TONGNO){
        super(hoten, DiaChi, SDT, email);
        this.MAKH = MAKH;
        this.TONGNO = TONGNO;
    }

    public String getMAKH(){
        return MAKH;
    }
    public void setMAKH (String MAKH){
        this.MAKH = MAKH;
    }

    public int getTONGNO(){
        return TONGNO;
    }
    public void setTONGNO (int TONGNO){
        this.TONGNO = TONGNO;
    }


}