
package slnsv2;


import java.math.BigDecimal;

public class ChiTietHoaDon {
    // Attributes
    private String maHoaDon;
    private String maSach;
    private int soLuong;
    private BigDecimal donGia; // Giá tại thời điểm bán

    // Constructors
    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maHoaDon, String maSach, int soLuong, BigDecimal donGia) {
        this.maHoaDon = maHoaDon;
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    // Getters and Setters
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
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
}