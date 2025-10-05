
package slnsv2;


import java.math.BigDecimal;

public class Sach {
    // Attributes
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private int soLuong;
    private BigDecimal donGia;
    private String maTheLoai;

    // Constructors
    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, String nhaXuatBan, int soLuong, BigDecimal donGia, String maTheLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maTheLoai = maTheLoai;
    }

    // Getters and Setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }
}