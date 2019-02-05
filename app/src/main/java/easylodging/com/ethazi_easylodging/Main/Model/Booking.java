package easylodging.com.ethazi_easylodging.Main.Model;

import java.io.Serializable;

public class Booking implements Serializable {
    private String id;
    private String id_lodging;
    private String id_user;
    private String check_in;
    private String check_out;
    private String status;

    public Booking() {
    }

    public Booking(String id, String id_lodging, String id_user, String check_in, String check_out, String status) {
        this.id = id;
        this.id_lodging = id_lodging;
        this.id_user = id_user;
        this.check_in = check_in;
        this.check_out = check_out;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_lodging() {
        return id_lodging;
    }

    public void setId_lodging(String id_lodging) {
        this.id_lodging = id_lodging;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
