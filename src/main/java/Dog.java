public class Dog {
    int id;
    String name;
    int ownersId;
    double tailsLength;
    String breed;
    int age;



    Dog() {
        this.id = 0;
        this.name = "";
        this.ownersId = 0;
        this.tailsLength = 0;
        this.breed = "";
        this.age = 0;

    }

    Dog(int ID, String name, double tailsLength, String breed, int age) {
        this.id = ID;
        this.name = name;
        this.ownersId = owner.getID();
        this.tailsLength = tailsLength;
        this.breed = breed;
        this.age = age;

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

    public int getOwnersID() {
        return ownersId;
    }

    public void setOwnersID(int ownersID) {
        this.ownersId = ownersID;
    }

    public double getTailsLength() {
        return tailsLength;
    }

    public void setTailsLength(double tailsLength) {
        this.tailsLength = tailsLength;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

