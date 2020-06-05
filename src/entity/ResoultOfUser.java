package entity;

public class ResoultOfUser {
    public boolean success;
    public String error;
    public User user;
    public String msg;

    public ResoultOfUser(boolean success, String error, User user, String msg) {
        this.success = success;
        this.error = error;
        this.user = user;
        this.msg = msg;
    }

    public ResoultOfUser() {
        super();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResoultOfUser{" +
                "success=" + success +
                ", error='" + error + '\'' +
                ", user=" + user +
                ", msg='" + msg + '\'' +
                '}';
    }
}
