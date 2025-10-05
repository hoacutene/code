package slnsv2;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDon {
    // Attributes
    private String maHoaDon;
    private Date ngayLap;
    private BigDecimal tongTien;
    private String maKhachHang;
    private List<ChiTietHoaDon> danhSachChiTiet;

    // Constructors
    public HoaDon() {
        // Khởi tạo danh sách để tránh lỗi NullPointerException
        this.danhSachChiTiet = new ArrayList<>();
    }

    public HoaDon(String maHoaDon, Date ngayLap, BigDecimal tongTien, String maKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
        this.danhSachChiTiet = new ArrayList<>();
    }

    // Getters and Setters
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public List<ChiTietHoaDon> getDanhSachChiTiet() {
        return danhSachChiTiet;
    }

    public void setDanhSachChiTiet(List<ChiTietHoaDon> danhSachChiTiet) {
        this.danhSachChiTiet = danhSachChiTiet;
    }
    
    // Helper method to add a detail line
    public void themChiTiet(ChiTietHoaDon chiTiet) {
        this.danhSachChiTiet.add(chiTiet);
    }
}