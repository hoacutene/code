public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(18,9,2006);
        Ngay ngay2 = new Ngay(16,6,2006);
        Ngay ngay3 = new Ngay(18,8,2008);
        Ngay ngay4 = new Ngay(10,10,2010);


        TacGia tg1 = new TacGia("NHÀ XUẤT BẢN QUỐC GIA SỰ THẬT",ngay1);
        TacGia tg2 = new TacGia("Hoà đẹp trai",ngay2);
        TacGia tg3 = new TacGia("Hoà cute s1tg",ngay3);
        TacGia tg4 = new TacGia("Hoà nè hêhhhe",ngay4);


        Sach sach1 = new Sach("Triết", 30000, 2000, tg1);
        Sach sach2 = new Sach("hehe", 30000, 2025, tg2);
        Sach sach3 = new Sach("hẹ hẹ", 30000, 2025, tg3);
        Sach sach4 = new Sach("hố hô", 30000, 2025, tg4);


    }
}
