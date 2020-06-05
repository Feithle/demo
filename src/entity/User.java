package entity;

public class User {
    public int user_id;
    public String email;//邮箱
    public String password;
    public String registdate;//入库时会转换格式
    public String usercate;//用户类别
    public String lastlogin;//最后的登录日期
    public int pic_id;//上传的图片的ID
    public int pic_like_id;//收藏的图片的ID
    public String path_avatar;//头像的存储路径
    public String loginstatue;//登录状态
    public String phone;//电话
    public String address;//地址

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistdate() {
        return registdate;
    }

    public void setRegistdate(String registdate) {
        this.registdate = registdate;
    }

    public String getUsercate() {
        return usercate;
    }

    public void setUsercate(String usercate) {
        this.usercate = usercate;
    }

    public String getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

    public int getPic_id() {
        return pic_id;
    }

    public void setPic_id(int pic_id) {
        this.pic_id = pic_id;
    }

    public int getPic_like_id() {
        return pic_like_id;
    }

    public void setPic_like_id(int pic_like_id) {
        this.pic_like_id = pic_like_id;
    }

    public String getPath_avatar() {
        return path_avatar;
    }

    public void setPath_avatar(String path_avatar) {
        this.path_avatar = path_avatar;
    }

    public String getLoginstatue() {
        return loginstatue;
    }

    public void setLoginstatue(String loginstatue) {
        this.loginstatue = loginstatue;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int user_id, String email, String password, String registdate,
                String usercate, String lastlogin, int pic_id, int pic_like_id,
                String path_avatar, String loginstatue, String phone, String address) {
        this.user_id = user_id;
        this.email = email;
        this.password = password;
        this.registdate = registdate;
        this.usercate = usercate;
        this.lastlogin = lastlogin;
        this.pic_id = pic_id;
        this.pic_like_id = pic_like_id;
        this.path_avatar = path_avatar;
        this.loginstatue = loginstatue;
        this.phone = phone;
        this.address = address;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", registdate=" + registdate
                + ", usercate=" + usercate + ", lastlogin=" + lastlogin + ", pic_id=" + pic_id + ", pic_like_id="
                + pic_like_id + ", path_avatar=" + path_avatar + ", loginstatue=" + loginstatue + ", phone=" + phone
                + ", address=" + address + "]";
    }

}
