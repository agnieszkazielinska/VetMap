public class Owner {
    int ID;
    String name;
    String surname;
    String email;
    int phone;


    Owner(int ID) {
        this.ID = ID;
        this.name = "";
        this.surname = "";
        this.email = "";
        this.phone = 0;
    }

    Owner() {
        this.ID = 0;
        this.name = "";
        this.surname = "";
        this.email = "";
        this.phone = 0;

    }

    Owner(int ID, String name, String surname, String email, int phone) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
