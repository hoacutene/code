public class TacGia {
    private String TenTacGia;
    private Ngay NgaySinh;

    public TacGia(String TenTacGia, Ngay NgaySinh) {
        this.TenTacGia = TenTacGia;
        this.NgaySinh = NgaySinh;

    }
    public String getTenTacGia() {
        return TenTacGia;
    }
    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public Ngay getNgaySinh() {
        return NgaySinh;
    }
    public void setNgaySinh(Ngay NgaySinh) {
        this.NgaySinh = NgaySinh;
    }


}
