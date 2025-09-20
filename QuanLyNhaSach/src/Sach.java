public class Sach {
    private String tensach;
    private float giaban;
    private int namxuatban;
    private TacGia tacGia;
    public Sach(String tensach, float giaban, int namxuatban, TacGia tacGia) {
        this.tensach = tensach;
        this.giaban = giaban;
        this.namxuatban = namxuatban;
        this.tacGia = tacGia;
    }
    public String getTensach() {
        return tensach;
    }
    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    public float getGiaban() {
        return giaban;
    }
    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }
    public int getNamxuatban() {
        return namxuatban;
    }
    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }
    public TacGia getTacGia() {
        return tacGia;
    }
    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

}
