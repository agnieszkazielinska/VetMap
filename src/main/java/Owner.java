public class Owner {
    int id;
    String name;
    String surname;
    String email;
    String phone;


    Owner(int ID) {
        this.id = ID;
        this.name = "";
        this.surname = "";
        this.email = "";
        this.phone = "";
    }

    Owner() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.email = "";
        this.phone = "0";

    }

    Owner(int ID, String name, String surname, String email, String phone) {
        this.id = ID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;

    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
