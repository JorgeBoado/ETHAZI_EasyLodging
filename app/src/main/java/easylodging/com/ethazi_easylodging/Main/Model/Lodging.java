package easylodging.com.ethazi_easylodging.Main.Model;

public class Lodging {

    private String name;
    private String coor;
    private String type;
    private String description;
    private String phone;
    private String address;
    private String marks;
    private String postalcode;
    private String category;
    private String turismemail;
    private String web;
    private int capacity;
    private String friendlyurl;

    public Lodging(String name, String coor, String type, String description, String phone,
                   String address, String marks, String postalcode, String category,
                   String turismemail, String web, int capacity, String friendlyurl) {
        this.name = name;
        this.coor = coor;
        this.type = type;
        this.description = description;
        this.phone = phone;
        this.address = address;
        this.marks = marks;
        this.postalcode = postalcode;
        this.category = category;
        this.turismemail = turismemail;
        this.web = web;
        this.capacity = capacity;
        this.friendlyurl = friendlyurl;
    }
    public Lodging(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTurismemail() {
        return turismemail;
    }

    public void setTurismemail(String turismemail) {
        this.turismemail = turismemail;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFriendlyurl() {
        return friendlyurl;
    }

    public void setFriendlyurl(String friendlyurl) {
        this.friendlyurl = friendlyurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoor() {
        return coor;
    }

    public void setCoor(String coor) {
        this.coor = coor;
    }
}