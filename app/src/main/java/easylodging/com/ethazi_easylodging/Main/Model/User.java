package easylodging.com.ethazi_easylodging.Main.Model;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String dni;
    private String nick;
    private String pass;
    private String email;

    public User() {
    }

    public User(String id, String dni, String nick, String pass, String email) {
        this.id = id;
        this.dni = dni;
        this.nick = nick;
        this.pass = pass;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
