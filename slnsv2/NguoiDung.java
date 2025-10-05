
package slnsv2;

/**
 *
 * @author hoangvuhoa
 */
public class NguoiDung extends Nguoi {
    private String username;
    private String password;
    private String chucvu;
    

    
    public NguoiDung(){
        super();
    }
    public NguoiDung(String hoten, String DiaChi, String SDT, String email, String username, String password, String chucvu ){
        super(hoten, DiaChi,SDT, email);
        this.username = username;
        this.password = password;
        this.chucvu = chucvu;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucVu() {
        return chucvu;
    }

    public void setChucVu(String chucvu) {
        this.chucvu = chucvu;
    }
}
